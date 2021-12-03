/*

 */
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class Salas {
    private Integer idSala;
    private String nombreSala;
    private String descripcionSala;
    private Integer idLocalizacionSala;//tomar de la clase Localizacion, idLocalizacion

    public Salas(Integer idSala, String nombreSala, String descripcionSala, Integer idLocalizacionSala) {
        this.idSala = idSala;
        this.nombreSala = nombreSala;
        this.descripcionSala = descripcionSala;
        this.idLocalizacionSala = idLocalizacionSala;
    }

    public Salas() {
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getDescripcionSala() {
        return descripcionSala;
    }

    public void setDescripcionSala(String descripcionSala) {
        this.descripcionSala = descripcionSala;
    }

    public Integer getIdLocalizacionSala() {
        return idLocalizacionSala;
    }

    public void setIdLocalizacionSala(Integer idLocalizacionSala) {
        this.idLocalizacionSala = idLocalizacionSala;
    }
    
}
