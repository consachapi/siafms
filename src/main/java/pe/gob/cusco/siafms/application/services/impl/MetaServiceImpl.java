package pe.gob.cusco.siafms.application.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.cusco.siafms.application.feigns.FeignServiceController;
import pe.gob.cusco.siafms.application.feigns.clients.MetaFeignClient;
import pe.gob.cusco.siafms.application.models.dtos.MetaBodyDto;
import pe.gob.cusco.siafms.application.models.tpl.MetaAllTpl;
import pe.gob.cusco.siafms.application.models.tpl.MetaTpl;
import pe.gob.cusco.siafms.application.models.tpl.RubroTpl;
import pe.gob.cusco.siafms.application.services.MetaService;
import pe.gob.cusco.siafms.core.config.ConfigSiafms;

@Service
public class MetaServiceImpl implements MetaService {
    private static final Logger LOG = LoggerFactory.getLogger(MetaServiceImpl.class);

    private final ConfigSiafms configSiafms;
    private final FeignServiceController feignServiceController;

    public MetaServiceImpl(ConfigSiafms configSiafms, FeignServiceController feignServiceController) {
        this.configSiafms = configSiafms;
        this.feignServiceController = feignServiceController;
    }

    @Override
    public MetaAllTpl listarMetas(Integer anio) {
        LOG.info("Listando metas de {}", configSiafms.getEjecutora());
        MetaFeignClient clientFeign = feignServiceController.creating(MetaFeignClient.class);
        return clientFeign.fetchMetas(anio);
    }

}
