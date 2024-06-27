package pe.gob.cusco.siafms.core.config;

public class ConfigSiafms {
    private String url;
    private Integer ejecutora;
    private Integer anio;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getEjecutora() {
        return ejecutora;
    }

    public void setEjecutora(Integer ejecutora) {
        this.ejecutora = ejecutora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
