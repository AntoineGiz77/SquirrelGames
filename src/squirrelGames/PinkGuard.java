package squirrelGames;

import squirrelGames.exceptions.SupervisorInvalidoException;

public class PinkGuard {
    private String id;
    private String nombre;
    private String apellidos;
    private String rango;
    private PinkGuard supervisor;

    public PinkGuard(String id, String nombre, String apellidos, String rango) {

        this.id = id;
        this.nombre = nombre;
        this.rango = rango;

    }

    public String getId() {

        return id;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellidos() {

        return apellidos;

    }

    public String getRango() {

        return rango;

    }

    public PinkGuard getSupervisor() {

        return supervisor;

    }
    
    public void setSupervisor(PinkGuard supervisor) throws SupervisorInvalidoException {
        if (supervisor == null) {
            throw new SupervisorInvalidoException("El supervisor no puede ser nulo.");
        }
        if (supervisor.getRango().equals(this.getRango())) {
            throw new SupervisorInvalidoException("No puedes asignar un supervisor del mismo rango.");
        }
        this.supervisor = supervisor;
    }
    
}
