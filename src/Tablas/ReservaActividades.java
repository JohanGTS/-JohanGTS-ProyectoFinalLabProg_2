/*

 */
package Tablas;

import java.util.Date;

/**
 *
 * @author Johan Tavera
 */
public class ReservaActividades {
    private Integer idReservaActividad;
    private Date fechaReserva;
    private Date fechaBaja;
    private Boolean idEstReservaAct;//tomar de la clase EstadoReserva, estado
    private Integer idClienteResAct;//tomar de la clase Cliente, idCliente
    private Integer idActividad;//tomar de la clase Actividades, idAct
    private String idResHorAct;// tomar de la clase HorariosActividades, idHorarioAct

    public ReservaActividades(Integer idReservaActividad, Date fechaReserva, Date fechaBaja, Boolean idEstReservaAct, Integer idClienteResAct, Integer idActividad, String idResHorAct) {
        this.idReservaActividad = idReservaActividad;
        this.fechaReserva = fechaReserva;
        this.fechaBaja = fechaBaja;
        this.idEstReservaAct = idEstReservaAct;
        this.idClienteResAct = idClienteResAct;
        this.idActividad = idActividad;
        this.idResHorAct = idResHorAct;
    }

    public ReservaActividades() {
    }

    public Integer getIdReservaActividad() {
        return idReservaActividad;
    }

    public void setIdReservaActividad(Integer idReservaActividad) {
        this.idReservaActividad = idReservaActividad;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Boolean getIdEstReservaAct() {
        return idEstReservaAct;
    }

    public void setIdEstReservaAct(Boolean idEstReservaAct) {
        this.idEstReservaAct = idEstReservaAct;
    }

    public Integer getIdClienteResAct() {
        return idClienteResAct;
    }

    public void setIdClienteResAct(Integer idClienteResAct) {
        this.idClienteResAct = idClienteResAct;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getIdResHorAct() {
        return idResHorAct;
    }

    public void setIdResHorAct(String idResHorAct) {
        this.idResHorAct = idResHorAct;
    }
    
}
