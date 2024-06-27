package pe.gob.cusco.siafms.application.models.tpl;

import java.util.List;

public class Tpl {
    private boolean success;
    private String msg;
    private List<?> data;
    private int total;
    private int code;

    public Tpl() {
    }

    public Tpl(boolean success, String msg, List<?> data, int total, int code) {
        this.success = success;
        this.msg = msg;
        this.data = data;
        this.total = total;
        this.code = code;
    }

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

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
