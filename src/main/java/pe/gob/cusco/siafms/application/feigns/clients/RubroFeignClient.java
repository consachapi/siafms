package pe.gob.cusco.siafms.application.feigns.clients;

import org.springframework.web.bind.annotation.*;
import pe.gob.cusco.siafms.application.models.tpl.RubroTpl;

public interface RubroFeignClient {


    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/api/ffuente/rubro"},
            produces = {"application/json"}
    )
    RubroTpl fetchByMeta(
            @RequestParam("anio") Integer anio,
            @RequestParam("meta") Integer meta
    );
}
