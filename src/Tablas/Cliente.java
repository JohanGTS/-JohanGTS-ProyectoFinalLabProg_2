
package Tablas;

import java.util.Date;

/**
 *
 * @author Johan Tavera
 */
public class Cliente {
    private Integer idCliente;
    private String nombreCliente;
    private String apellidoPatCliente;
    private String apellidoMatCliente;
    private String direccionCliente;
    private Date fechaNacCliente;
    private String telCleinte;
    private String celularCleinte;
    private Date fechaIngreso;
    private Boolean statusCliente;
    private Integer tipoCliente;
    private String correoCliente;
    private Double balanceCliente;
    private Double valorCuotaCliente;

    public Cliente(Integer idCliente, String nombreCliente, String apellidoPatCliente,
        String apellidoMatCliente, String direccionCliente, Date fechaNacCliente,
        String telCleinte, String celularCleinte, Date fechaIngreso, Boolean statusCliente, 
        Integer tipoCliente, String correoCliente, Double balanceCliente, Double valorCuotaCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoPatCliente = apellidoPatCliente;
        this.apellidoMatCliente = apellidoMatCliente;
        this.direccionCliente = direccionCliente;
        this.fechaNacCliente = fechaNacCliente;
        this.telCleinte = telCleinte;
        this.celularCleinte = celularCleinte;
        this.fechaIngreso = fechaIngreso;
        this.statusCliente = statusCliente;
        this.tipoCliente = tipoCliente;
        this.correoCliente = correoCliente;
        this.balanceCliente = balanceCliente;
        this.valorCuotaCliente = valorCuotaCliente;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoPatCliente() {
        return apellidoPatCliente;
    }

    public void setApellidoPatCliente(String apellidoPatCliente) {
        this.apellidoPatCliente = apellidoPatCliente;
    }

    public String getApellidoMatCliente() {
        return apellidoMatCliente;
    }

    public void setApellidoMatCliente(String apellidoMatCliente) {
        this.apellidoMatCliente = apellidoMatCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public Date getFechaNacCliente() {
        return fechaNacCliente;
    }

    public void setFechaNacCliente(Date fechaNacCliente) {
        this.fechaNacCliente = fechaNacCliente;
    }

    public String getTelCleinte() {
        return telCleinte;
    }

    public void setTelCleinte(String telCleinte) {
        this.telCleinte = telCleinte;
    }

    public String getCelularCleinte() {
        return celularCleinte;
    }

    public void setCelularCleinte(String celularCleinte) {
        this.celularCleinte = celularCleinte;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isStatusCliente() {
        return statusCliente;
    }

    public void setStatusCliente(Boolean statusCliente) {
        this.statusCliente = statusCliente;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Integer tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public double getBalanceCliente() {
        return balanceCliente;
    }

    public void setBalanceCliente(Double balanceCliente) {
        this.balanceCliente = balanceCliente;
    }

    public double getValorCuotaCliente() {
        return valorCuotaCliente;
    }

    public void setValorCuotaCliente(Double valorCuotaCliente) {
        this.valorCuotaCliente = valorCuotaCliente;
    }
    
}
