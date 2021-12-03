
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class DetalleCuota {
    private String idCuota;//tomar de la clase EncabezadoCuota, idCuota
    private Integer secCuota;
    private String conceptoCuota;
    private Double valorCuota;
    private String idCobroCuenta;//tomar de la clase Cobro, idCobre

    public DetalleCuota(String idCuota, Integer secCuota, String conceptoCuota, Double valorCuota, String idCobroCuenta) {
        this.idCuota = idCuota;
        this.secCuota = secCuota;
        this.conceptoCuota = conceptoCuota;
        this.valorCuota = valorCuota;
        this.idCobroCuenta = idCobroCuenta;
    }

    public DetalleCuota() {
    }

    public String getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(String idCuota) {
        this.idCuota = idCuota;
    }

    public Integer getSecCuota() {
        return secCuota;
    }

    public void setSecCuota(Integer secCuota) {
        this.secCuota = secCuota;
    }

    public String getConceptoCuota() {
        return conceptoCuota;
    }

    public void setConceptoCuota(String conceptoCuota) {
        this.conceptoCuota = conceptoCuota;
    }

    public Double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(Double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public String getIdCobroCuenta() {
        return idCobroCuenta;
    }

    public void setIdCobroCuenta(String idCobroCuenta) {
        this.idCobroCuenta = idCobroCuenta;
    }
    
}
