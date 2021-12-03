/*

 */
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class Localizacion {
    private Integer idLocalizacion;
    private String tipo;

    public Localizacion(Integer idLocalizacion, String tipo) {
        this.idLocalizacion = idLocalizacion;
        this.tipo = tipo;
    }

    public Localizacion() {
    }

    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
