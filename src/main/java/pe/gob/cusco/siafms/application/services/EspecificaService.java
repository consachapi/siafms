package pe.gob.cusco.siafms.application.services;

import pe.gob.cusco.siafms.application.models.tpl.EspecificaEjecucionTpl;

public interface EspecificaService {
    EspecificaEjecucionTpl getAllByMeta(Integer anio, Integer meta);
}
