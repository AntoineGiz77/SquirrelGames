package squirrelGames.integrantesJuego;

import squirrelGames.exceptions.SupervisorInvalidoException;

public class PinkGuard {
    private String id;
    private String nombre;
    protected String apellidos;
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

        String rangoSupervisor = supervisor.getRango();
        String rangoSubordinado = this.getRango();

        int nivelSupervisor = obtenerNivelRango(rangoSupervisor);
        int nivelSubordinado = obtenerNivelRango(rangoSubordinado);

        if (nivelSupervisor <= nivelSubordinado) {
            throw new SupervisorInvalidoException(
                "El supervisor debe ser de un rango superior. " +
                "Intentaste asignar a un " + rangoSupervisor + " como supervisor de un " + rangoSubordinado + "."
            );
        }

        this.supervisor = supervisor;
    }

    private int obtenerNivelRango(String rango) {
        return switch (rango.toLowerCase()) {
            case "worker" -> 1;
            case "soldier" -> 2;
            case "manager" -> 3;
            default -> 0; 
        };
    }

    
}
