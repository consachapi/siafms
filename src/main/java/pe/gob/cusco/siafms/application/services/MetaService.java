package pe.gob.cusco.siafms.application.services;

import pe.gob.cusco.siafms.application.models.tpl.MetaAllTpl;

public interface MetaService {
    MetaAllTpl listarMetas(Integer anio);
}
