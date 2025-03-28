package pe.gob.cusco.siafms.application.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.cusco.siafms.application.models.tpl.MetaAllTpl;
import pe.gob.cusco.siafms.application.services.MetaService;

@CrossOrigin()
@RestController
@RequestMapping(MetaController.META)
public class MetaController {
    public static final String META = "/metas";
    private static final String LISTAR_POR_ANIO = "";
    private static final String BUSCAR = "/buscar/{anio}/{numero}";
    private static final String RUBRO_POR_META = "/ff_rubro/{meta}/{anio}";

    private final MetaService metaService;

    public MetaController(MetaService metaService) {
        this.metaService = metaService;
    }

    @GetMapping(LISTAR_POR_ANIO)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MetaAllTpl> listarMetas(@RequestParam("anio") Integer anio) {
        return new ResponseEntity<>(metaService.listarMetas(anio), HttpStatus.OK);
    }

}
