
package Tablas;

import java.util.Date;

/**
 *
 * @author Johan Tavera
 */
public class EncabezadoCuota {
    private String idCuota;
    private Date fechaCuota;
    private Integer idClienteCuota;//tomar de clase Cliente, idCliente
    private Double valorCobro;
    private Boolean statusCuota;

    public EncabezadoCuota(String idCuota, Date fechaCuota, Integer idClienteCuota, Double valorCobro, Boolean statusCuota) {
        this.idCuota = idCuota;
        this.fechaCuota = fechaCuota;
        this.idClienteCuota = idClienteCuota;
        this.valorCobro = valorCobro;
        this.statusCuota = statusCuota;
    }

    public EncabezadoCuota() {
    }

    public String getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(String idCuota) {
        this.idCuota = idCuota;
    }

    public Date getFechaCuota() {
        return fechaCuota;
    }

    public void setFechaCuota(Date fechaCuota) {
        this.fechaCuota = fechaCuota;
    }

    public Integer getIdClienteCuota() {
        return idClienteCuota;
    }

    public void setIdClienteCuota(Integer idClienteCuota) {
        this.idClienteCuota = idClienteCuota;
    }

    public Double getValorCobro() {
        return valorCobro;
    }

    public void setValorCobro(Double valorCobro) {
        this.valorCobro = valorCobro;
    }

    public Boolean getStatusCuota() {
        return statusCuota;
    }

    public void setStatusCuota(Boolean statusCuota) {
        this.statusCuota = statusCuota;
    }
    
}
