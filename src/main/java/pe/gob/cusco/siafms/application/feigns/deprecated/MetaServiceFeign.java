package pe.gob.cusco.siafms.application.feigns.deprecated;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.gob.cusco.siafms.application.models.tpl.MetaTpl;

@FeignClient(
        name = "meta-service",
        url = "http://10.0.10.50:8081",
        path = "/api/meta"
)
public interface MetaServiceFeign {
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/buscar"},
            produces = {"application/json"}
    )
    MetaTpl findInfoMetaByNumMeta(@RequestParam("anio") Integer anio, @RequestParam("ejecutor") Integer ejec, @RequestParam("meta") Integer meta, @RequestHeader("X-Siaf-Key") String key);
}
