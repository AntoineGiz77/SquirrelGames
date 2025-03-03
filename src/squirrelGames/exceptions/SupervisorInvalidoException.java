package squirrelGames.exceptions;

/**
 * Excepción que se lanza cuando se intenta asignar un supervisor no válido.
 * Esta excepción incluye un mensaje que describe el motivo del error.
 */
public class SupervisorInvalidoException extends Exception {

	/**
	 * Identificador único de versión para la serialización.
	 */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la excepción SupervisorInvalidoException.
     * 
     * @param mensaje El mensaje que describe el motivo de la excepción.
     */
    public SupervisorInvalidoException(String mensaje) {
        super(mensaje);
    }
}
