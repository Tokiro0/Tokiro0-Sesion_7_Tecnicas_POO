package gestordecitas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tokiro
 */
public class GestorDeCitas {

    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    
    public static List<String> horasDisponibles = new ArrayList<>();
    public static List<String> fechaDisponibles = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Genero las listas en blanco para todo el sistema hasta que se cierre
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        
        horasDisponibles.add("9:00am");
        horasDisponibles.add("9:30am");
        horasDisponibles.add("10:00am");
        horasDisponibles.add("10:30am");
        horasDisponibles.add("11:00am");
        horasDisponibles.add("11:30am");
        
        fechaDisponibles.add("05/05/2023");
        fechaDisponibles.add("06/05/2023");
        fechaDisponibles.add("07/05/2023");
        fechaDisponibles.add("08/05/2023");
        fechaDisponibles.add("09/05/2023");
        
        //Inicio la ventana principal de gestor de citas.
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null);//Centra el formulario
        framePrincipal.setVisible(true);
    }

}
