package squirrelGames.integrantesJuego;

import squirrelGames.exceptions.SupervisorInvalidoException;

/**
 * Clase que representa a un "PinkGuard", un tipo de integrante dentro del juego con un
 * rango determinado y la posibilidad de tener un supervisor.
 * Esta clase permite asignar supervisores a los PinkGuards, siempre que el supervisor
 * tenga un rango superior al subordinado.
 */
public class PinkGuard {
	
	/**
	 * Apellidos del Pink Guard.
	 */
	protected String apellidos;

	/**
	 * Identificador único del Pink Guard.
	 */
	private String id;

	/**
	 * Nombre del Pink Guard.
	 */
	private String nombre;

	/**
	 * Rango del Pink Guard.
	 */
	private String rango;

	/**
	 * Supervisor del Pink Guard.
	 */
	private PinkGuard supervisor;


    /**
     * Constructor de la clase PinkGuard.
     * 
     * @param id El identificador único del PinkGuard.
     * @param nombre El nombre del PinkGuard.
     * @param apellidos Los apellidos del PinkGuard.
     * @param rango El rango del PinkGuard (por ejemplo, "worker", "soldier", "manager").
     */
    public PinkGuard(String id, String nombre, String apellidos, String rango) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
    }

    /**
     * Obtiene el identificador único del PinkGuard.
     * 
     * @return El identificador del PinkGuard.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el nombre del PinkGuard.
     * 
     * @return El nombre del PinkGuard.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los apellidos del PinkGuard.
     * 
     * @return Los apellidos del PinkGuard.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene el rango del PinkGuard.
     * 
     * @return El rango del PinkGuard.
     */
    public String getRango() {
        return rango;
    }

    /**
     * Obtiene el supervisor del PinkGuard.
     * 
     * @return El supervisor del PinkGuard, o null si no tiene supervisor asignado.
     */
    public PinkGuard getSupervisor() {
        return supervisor;
    }

    /**
     * Establece un supervisor para el PinkGuard.
     * Este método verifica que el supervisor tenga un rango superior antes de asignarlo.
     * 
     * @param supervisor El PinkGuard que se desea asignar como supervisor.
     * @throws SupervisorInvalidoException Si el supervisor es nulo o tiene un rango igual o inferior.
     */
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

    /**
     * Obtiene el nivel numérico asociado a un rango.
     * El rango "worker" tiene nivel 1, "soldier" tiene nivel 2 y "manager" tiene nivel 3.
     * Otros rangos tienen nivel 0.
     * 
     * @param rango El rango a evaluar.
     * @return El nivel numérico correspondiente al rango.
     */
    private int obtenerNivelRango(String rango) {
        return switch (rango.toLowerCase()) {
            case "worker" -> 1;
            case "soldier" -> 2;
            case "manager" -> 3;
            default -> 0;
        };
    }
}

