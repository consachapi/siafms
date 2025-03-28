package pe.gob.cusco.siafms.application.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.cusco.siafms.application.models.tpl.RubroTpl;
import pe.gob.cusco.siafms.application.services.RubroService;

@CrossOrigin()
@RestController
@RequestMapping(RubroController.RUBROS)
public class RubroController {
    public static final String RUBROS = "/rubros";
    private static final String POR_META = "";

    private final RubroService rubroPorMeta;

    public RubroController(RubroService rubroPorMeta) {
        this.rubroPorMeta = rubroPorMeta;
    }

    @GetMapping(POR_META)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<RubroTpl> rubroPorMeta(@RequestParam("anio") final Integer anio, @RequestParam("meta") final Integer meta) {
        return new ResponseEntity<>(rubroPorMeta.getByMeta(anio, meta), HttpStatus.OK);
    }

}
