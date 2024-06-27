package pe.gob.cusco.siafms.application.services;

import pe.gob.cusco.siafms.application.models.tpl.RubroTpl;

public interface RubroService {
    RubroTpl getByMeta(Integer anio, Integer meta);
}
