package pe.gob.cusco.siafms.application.models;

public class Rubro {
    private String descripcion;
    private String fuente_financ;
    private String rubro;
    private String rubro_nombre;
    private String meta;
    private String ff_nombre;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFuente_financ() {
        return fuente_financ;
    }

    public void setFuente_financ(String fuente_financ) {
        this.fuente_financ = fuente_financ;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRubro_nombre() {
        return rubro_nombre;
    }

    public void setRubro_nombre(String rubro_nombre) {
        this.rubro_nombre = rubro_nombre;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getFf_nombre() {
        return ff_nombre;
    }

    public void setFf_nombre(String ff_nombre) {
        this.ff_nombre = ff_nombre;
    }
}
