package entidades;

/**
 *
 * @author tokiro
 */
public class Paciente {

    private String dni;
    private String nombre;
    private String telefono;
    private int sexoBiologico;

    public final static int MASCULINO = 0;
    public final static int FEMENINO = 1;

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sexoBiologico
     */
    public int getSexoBiologico() {
        return sexoBiologico;
    }

    /**
     * @param sexoBiologico the sexoBiologico to set
     */
    public void setSexoBiologico(int sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public String getDatosMostrar() {
        return this.nombre = " - DNI: " + this.dni;
    }
}
