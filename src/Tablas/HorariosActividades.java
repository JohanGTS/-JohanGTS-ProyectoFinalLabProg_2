
package Tablas;

/**
 *
 * @author Johan Tavera
 */
public class HorariosActividades {
    private String idHorarioAct;
    private String diaAct;
    private Integer horaAct;
    private Integer idActividades;//tomar de la clase Actividades, idAct

    public HorariosActividades(String idHorarioAct, String diaAct, Integer horaAct, Integer idActividades) {
        this.idHorarioAct = idHorarioAct;
        this.diaAct = diaAct;
        this.horaAct = horaAct;
        this.idActividades = idActividades;
    }

    public HorariosActividades() {
    }

    public String getIdHorarioAct() {
        return idHorarioAct;
    }

    public void setIdHorarioAct(String idHorarioAct) {
        this.idHorarioAct = idHorarioAct;
    }

    public String getDiaAct() {
        return diaAct;
    }

    public void setDiaAct(String diaAct) {
        this.diaAct = diaAct;
    }

    public int getHoraAct() {
        return horaAct;
    }

    public void setHoraAct(Integer horaAct) {
        this.horaAct = horaAct;
    }

    public Integer getIdActividades() {
        return idActividades;
    }

    public void setIdActividades(Integer idActividades) {
        this.idActividades = idActividades;
    }
    
}
