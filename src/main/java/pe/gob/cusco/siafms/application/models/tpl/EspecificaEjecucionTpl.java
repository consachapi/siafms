package pe.gob.cusco.siafms.application.models.tpl;

import pe.gob.cusco.siafms.application.models.EspecificaEjecucion;

import java.util.List;

public class EspecificaEjecucionTpl {
    private boolean success;
    private String msg;
    private List<EspecificaEjecucion> data;
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

    public List<EspecificaEjecucion> getData() {
        return data;
    }

    public void setData(List<EspecificaEjecucion> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
