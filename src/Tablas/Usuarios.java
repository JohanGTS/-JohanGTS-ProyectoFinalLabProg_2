
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class Usuarios {
    private String loginUsuario;
    private String passUsuario;
    private Integer nivelAcceso;
    private String nombreUsuario;
    private String apellidosUsuario;
    private String correoUsuario;

    public Usuarios(String loginUsuario, String passUsuario, Integer nivelAcceso, String nombreUsuario, String apellidosUsuario, String correoUsuario) {
        this.loginUsuario = loginUsuario;
        this.passUsuario = passUsuario;
        this.nivelAcceso = nivelAcceso;
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.correoUsuario = correoUsuario;
    }

    public Usuarios() {
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(Integer nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
  
}
