package pe.gob.cusco.siafms.application.models.dtos;

public class ExpedienteDto {
    private String ciclo;
    private String clasificador;
    private String correlativo;
    private String documento;
    private String estado;
    private String fase;
    private String fecha_proceso;
    private String meta;
    private String modalidad_compra;
    private String monto;
    private String monto_total;
    private String numero;
    private String rubro;
    private String ruc;
    private String secuencia;
    private String tipo_operacion;
    private String tipo_proceso;

    public ExpedienteDto() {
    }

    public ExpedienteDto(String ciclo, String clasificador, String correlativo, String documento, String estado, String fase, String fecha_proceso, String meta, String modalidad_compra, String monto, String monto_total, String numero, String rubro, String ruc, String secuencia, String tipo_operacion, String tipo_proceso) {
        this.ciclo = ciclo;
        this.clasificador = clasificador;
        this.correlativo = correlativo;
        this.documento = documento;
        this.estado = estado;
        this.fase = fase;
        this.fecha_proceso = fecha_proceso;
        this.meta = meta;
        this.modalidad_compra = modalidad_compra;
        this.monto = monto;
        this.monto_total = monto_total;
        this.numero = numero;
        this.rubro = rubro;
        this.ruc = ruc;
        this.secuencia = secuencia;
        this.tipo_operacion = tipo_operacion;
        this.tipo_proceso = tipo_proceso;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getClasificador() {
        return clasificador;
    }

    public void setClasificador(String clasificador) {
        this.clasificador = clasificador;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getFecha_proceso() {
        return fecha_proceso;
    }

    public void setFecha_proceso(String fecha_proceso) {
        this.fecha_proceso = fecha_proceso;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getModalidad_compra() {
        return modalidad_compra;
    }

    public void setModalidad_compra(String modalidad_compra) {
        this.modalidad_compra = modalidad_compra;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(String monto_total) {
        this.monto_total = monto_total;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getTipo_operacion() {
        return tipo_operacion;
    }

    public void setTipo_operacion(String tipo_operacion) {
        this.tipo_operacion = tipo_operacion;
    }

    public String getTipo_proceso() {
        return tipo_proceso;
    }

    public void setTipo_proceso(String tipo_proceso) {
        this.tipo_proceso = tipo_proceso;
    }
}
