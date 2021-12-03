
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class EstadoReserva {
    private String idEstadoReserva;
    private Boolean estado;

    public EstadoReserva(String idEstadoReserva, Boolean estado) {
        this.idEstadoReserva = idEstadoReserva;
        this.estado = estado;
    }

    public EstadoReserva() {
    }

    public String getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(String idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
