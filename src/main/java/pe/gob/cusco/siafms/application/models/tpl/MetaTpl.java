package pe.gob.cusco.siafms.application.models.tpl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pe.gob.cusco.siafms.application.models.Meta;

import java.util.List;

public class MetaTpl extends Tpl {
    private List<Meta> data;

    public List<Meta> getData() {
        return this.data;
    }

    public void setData(List<?> data) {
        ObjectMapper mapper = new ObjectMapper();
        this.data = (List)mapper.convertValue(data, new TypeReference<List<Meta>>() {
        });
    }
}
