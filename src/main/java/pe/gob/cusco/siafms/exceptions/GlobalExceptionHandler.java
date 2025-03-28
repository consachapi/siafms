package pe.gob.cusco.siafms.exceptions;

import feign.FeignException;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pe.gob.cusco.siafms.core.ErrorMessage;

import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler({FeignException.class})
    public ResponseEntity<ErrorMessage> handleFeignStatusException(FeignException e, HttpServletRequest request) {
        LOG.error("FeignException en {}", e.getLocalizedMessage());
        int status = e.status() < 399 ? 400 : e.status();
        ErrorMessage message = new ErrorMessage(status, new Date(), e.getLocalizedMessage(), e.getMessage(), request.getRequestURI());
        if (e.status() == 500) {
            message.setStatus(404);
            message.setError(e.getCause().getMessage());
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else if (e.status() == 401) {
            message.setError("No autorizado.");
            return new ResponseEntity<>(message, HttpStatus.UNAUTHORIZED);
        } else if (e.status() == 403) {
            message.setError("No tiene permisos para obtener recursos.");
            return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
        } else {
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
    }

}
