package pe.gob.cusco.siafms.application.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.cusco.siafms.application.feigns.FeignServiceController;
import pe.gob.cusco.siafms.application.feigns.clients.RubroFeignClient;
import pe.gob.cusco.siafms.application.models.tpl.RubroTpl;
import pe.gob.cusco.siafms.application.services.RubroService;

@Service
public class RubroServiceImpl implements RubroService {
    @Autowired
    private FeignServiceController feignServiceController;

    @Override
    public RubroTpl getByMeta(Integer anio, Integer meta) {
        RubroFeignClient rubroFeignClient = feignServiceController.creating(RubroFeignClient.class);
        return rubroFeignClient.fetchByMeta(anio, meta);
    }

}
