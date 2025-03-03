package squirrelGames.exceptions;

/**
 * Excepción que se lanza cuando se intenta realizar una simulación no permitida.
 * Esta excepción incluye un mensaje que describe el motivo del error.
 */
public class SimulacionNoPermitidaException extends Exception {

	/**
	 * Identificador único de versión para la serialización.
	 */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la excepción SimulacionNoPermitidaException.
     * 
     * @param mensaje El mensaje que describe el motivo de la excepción.
     */
    public SimulacionNoPermitidaException(String mensaje) {
        super(mensaje);
    }
}
