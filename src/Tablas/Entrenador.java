
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class Entrenador {
    private Integer idEntrenador;
    private String nombreEntrenador;
    private String apellidoEntrenador;
    private String telEntrenador;
    private String correoEntrenador;

    public Entrenador(Integer idEntrenador, String nombreEntrenador, String apellidoEntrenador, String telEntrenador, String correoEntrenador) {
        this.idEntrenador = idEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.apellidoEntrenador = apellidoEntrenador;
        this.telEntrenador = telEntrenador;
        this.correoEntrenador = correoEntrenador;
    }

    public Entrenador() {
    }

    public Integer getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(Integer idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidoEntrenador() {
        return apellidoEntrenador;
    }

    public void setApellidoEntrenador(String apellidoEntrenador) {
        this.apellidoEntrenador = apellidoEntrenador;
    }

    public String getTelEntrenador() {
        return telEntrenador;
    }

    public void setTelEntrenador(String telEntrenador) {
        this.telEntrenador = telEntrenador;
    }

    public String getCorreoEntrenador() {
        return correoEntrenador;
    }

    public void setCorreoEntrenador(String correoEntrenador) {
        this.correoEntrenador = correoEntrenador;
    }
    
}
