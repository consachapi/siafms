package pe.gob.cusco.siafms.application.feigns.clients;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.gob.cusco.siafms.application.models.tpl.EspecificaEjecucionTpl;

public interface EjecucionFeignClient {

    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/api/gasto"},
            produces = {"application/json"}
    )
    EspecificaEjecucionTpl getAllByMeta(
            @RequestParam("anio") Integer anio,
            @RequestParam("meta") Integer meta
    );

}
