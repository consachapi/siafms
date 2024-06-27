package pe.gob.cusco.siafms.application.models.tpl;

import pe.gob.cusco.siafms.application.models.Rubro;

import java.util.List;

public class RubroTpl {
    private boolean success;
    private String msg;
    private List<Rubro> data;
    private Integer total;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Rubro> getData() {
        return data;
    }

    public void setData(List<Rubro> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
