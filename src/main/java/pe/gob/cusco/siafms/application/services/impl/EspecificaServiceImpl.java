package pe.gob.cusco.siafms.application.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.cusco.siafms.application.feigns.FeignServiceController;
import pe.gob.cusco.siafms.application.feigns.clients.EjecucionFeignClient;
import pe.gob.cusco.siafms.application.models.EspecificaEjecucion;
import pe.gob.cusco.siafms.application.models.tpl.EspecificaEjecucionTpl;
import pe.gob.cusco.siafms.application.services.EspecificaService;
import pe.gob.cusco.siafms.core.Utils;
import pe.gob.cusco.siafms.core.config.ConfigSiafms;

import java.util.ArrayList;
import java.util.List;

@Service
public class EspecificaServiceImpl implements EspecificaService {

    private static final Logger LOG = LoggerFactory.getLogger(EspecificaServiceImpl.class);

    @Autowired private ConfigSiafms configSiafms;
    @Autowired private FeignServiceController feignServiceController;

    @Override
    public EspecificaEjecucionTpl getAllByMeta(Integer anio, Integer meta) {
        EjecucionFeignClient clientFeign = feignServiceController.creating(EjecucionFeignClient.class);
        EspecificaEjecucionTpl ejecucionPresupuestaTpl = clientFeign.getAllByMeta(anio, meta);
        List<EspecificaEjecucion> especificaEjecucions = ejecucionPresupuestaTpl.getData();
        List<EspecificaEjecucion> updateEspecificas = new ArrayList<>();
        for (EspecificaEjecucion especificaEjecucion: especificaEjecucions){
            String clasificador = Utils.formatClasificador(especificaEjecucion.getClasificador());
            EspecificaEjecucion update = new EspecificaEjecucion();
            BeanUtils.copyProperties(especificaEjecucion, update);
            update.setClasificador(clasificador);
            updateEspecificas.add(update);
        }
        ejecucionPresupuestaTpl.setData(updateEspecificas);
        return ejecucionPresupuestaTpl;
    }

}
