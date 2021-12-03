
package Tablas;

import java.util.Date;

/**
 *
 * @author Johan Tavera
 */
public class Reserva {
    private String idReserva;
    private Integer idSalaReserva;//tomar de la clase Salas, idSala
    private Integer idClienteReserva;//tomar de la clase Cliente, idCliente
    private Date fechaReserva;
    private Integer idReservaActividad;//tomar de la clase ReservaActividades, idReservaActividad
    private Boolean idEstadoReserva;//tomar de la clase EstadoReserva, idEstadoReserva

    public Reserva(String idReserva, Integer idSalaReserva, Integer idClienteReserva, Date fechaReserva, Integer idReservaActividad, Boolean idEstadoReserva) {
        this.idReserva = idReserva;
        this.idSalaReserva = idSalaReserva;
        this.idClienteReserva = idClienteReserva;
        this.fechaReserva = fechaReserva;
        this.idReservaActividad = idReservaActividad;
        this.idEstadoReserva = idEstadoReserva;
    }

    public Reserva() {
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Integer getIdSalaReserva() {
        return idSalaReserva;
    }

    public void setIdSalaReserva(Integer idSalaReserva) {
        this.idSalaReserva = idSalaReserva;
    }

    public Integer getIdClienteReserva() {
        return idClienteReserva;
    }

    public void setIdClienteReserva(Integer idClienteReserva) {
        this.idClienteReserva = idClienteReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getIdReservaActividad() {
        return idReservaActividad;
    }

    public void setIdReservaActividad(Integer idReservaActividad) {
        this.idReservaActividad = idReservaActividad;
    }

    public Boolean getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(Boolean idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }
    
}
