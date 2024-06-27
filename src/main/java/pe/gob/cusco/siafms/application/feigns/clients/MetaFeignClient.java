package pe.gob.cusco.siafms.application.feigns.clients;

import org.springframework.web.bind.annotation.*;
import pe.gob.cusco.siafms.application.models.tpl.MetaAllTpl;

public interface MetaFeignClient {

    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/api/metas"},
            produces = {"application/json"}
    )
    MetaAllTpl fetchMetas(
            @RequestParam("anio") Integer anio
    );

}
