
package Tablas;

import java.util.Date;

/**
 *
 * @author Johan Tavera
 */
public class Cobro {
    private String idCobro;
    private Date fechaCobro;
    private Integer idClienteCobro;//tomar de la clase Cliente, idCliente
    private Double valorCobro;
    private String conceptoCobro;
    private Boolean statusCobro;

    public Cobro(String idCobro, Date fechaCobro, Integer idClienteCobro, Double valorCobro, String conceptoCobro, Boolean statusCobro) {
        this.idCobro = idCobro;
        this.fechaCobro = fechaCobro;
        this.idClienteCobro = idClienteCobro;
        this.valorCobro = valorCobro;
        this.conceptoCobro = conceptoCobro;
        this.statusCobro = statusCobro;
    }

    public Cobro() {
    }

    public String getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(String idCobro) {
        this.idCobro = idCobro;
    }

    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public Integer getIdClienteCobro() {
        return idClienteCobro;
    }

    public void setIdClienteCobro(Integer idClienteCobro) {
        this.idClienteCobro = idClienteCobro;
    }

    public Double getValorCobro() {
        return valorCobro;
    }

    public void setValorCobro(Double valorCobro) {
        this.valorCobro = valorCobro;
    }

    public String getConceptoCobro() {
        return conceptoCobro;
    }

    public void setConceptoCobro(String conceptoCobro) {
        this.conceptoCobro = conceptoCobro;
    }

    public Boolean getStatusCobro() {
        return statusCobro;
    }

    public void setStatusCobro(Boolean statusCobro) {
        this.statusCobro = statusCobro;
    }
    
}
