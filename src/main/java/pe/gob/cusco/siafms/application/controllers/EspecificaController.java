package pe.gob.cusco.siafms.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.cusco.siafms.application.models.tpl.EspecificaEjecucionTpl;
import pe.gob.cusco.siafms.application.services.EspecificaService;

@CrossOrigin()
@RestController
@RequestMapping(EspecificaController.ESPECIFICAS)
public class EspecificaController {
    public static final String ESPECIFICAS = "/especificas";
    private static final String POR_META = "";

    @Autowired private EspecificaService especificaService;

    @GetMapping(POR_META)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<EspecificaEjecucionTpl> disponibilidad(@RequestParam("anio") final Integer anio, @RequestParam("meta") final Integer meta) {
        return new ResponseEntity<>(especificaService.getAllByMeta(anio, meta), HttpStatus.OK);
    }
}
