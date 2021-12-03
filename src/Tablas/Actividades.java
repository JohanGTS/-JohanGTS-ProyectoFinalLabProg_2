
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class Actividades {
    private Integer idAct;
    private String nombreAct;
    private String descripcionAct;
    private Integer idLocalizacion;//tomar de la clase Localizacion, idLocalizacion
    private Integer idEntrenador;//tomar de la clase Entrenador, idEntrenador

    public Actividades(Integer idAct, String nombreAct, String descripcionAct, Integer idLocalizacion, Integer idEntrenador) {
        this.idAct = idAct;
        this.nombreAct = nombreAct;
        this.descripcionAct = descripcionAct;
        this.idLocalizacion = idLocalizacion;
        this.idEntrenador = idEntrenador;
    }

    public Actividades() {
    }

    public int getIdAct() {
        return idAct;
    }

    public void setIdAct(Integer idAct) {
        this.idAct = idAct;
    }

    public String getNombreAct() {
        return nombreAct;
    }

    public void setNombreAct(String nombreAct) {
        this.nombreAct = nombreAct;
    }

    public String getDescripcionAct() {
        return descripcionAct;
    }

    public void setDescripcionAct(String descripcionAct) {
        this.descripcionAct = descripcionAct;
    }

    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public Integer getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(Integer idEntrenador) {
        this.idEntrenador = idEntrenador;
    }
    
}
