package pe.gob.cusco.siafms.application.models.tpl;

import pe.gob.cusco.siafms.application.models.Meta;

import java.util.List;

public class MetaAllTpl {
    private boolean success;
    private String msg;
    private List<Meta> data;
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

    public List<Meta> getData() {
        return data;
    }

    public void setData(List<Meta> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
