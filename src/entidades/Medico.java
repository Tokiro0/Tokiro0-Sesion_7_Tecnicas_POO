package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tokiro
 */
public class Medico {

    private String nombre;
    private String CMP;
    private List<Especialidad> especialidades;

    public Medico(String nombre, String CMP, List<Especialidad> especialidades) throws Exception {
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidades = especialidades;
        if (especialidades == null) {
            throw new Exception("No se puede crear");
        }
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        this.especialidades.add(especialidad);
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the CMP
     */
    public String getCMP() {
        return CMP;
    }

    /**
     * @param CMP the CMP to set
     */
    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public String getDatosMostrar() {
        return this.nombre = " - CMP: " + this.CMP;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }
}
