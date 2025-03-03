package squirrelGames.exceptions;

/**
 * Excepción que se lanza cuando se intenta agregar un jugador duplicado.
 * Esta excepción incluye un mensaje que describe el motivo del error.
 */
public class JugadorDuplicadoException extends Exception {

	/**
	 * Identificador único de versión para la serialización.
	 */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la excepción JugadorDuplicadoException.
     * 
     * @param mensaje El mensaje que describe el motivo de la excepción.
     */
    public JugadorDuplicadoException(String mensaje) {
        super(mensaje);
    }
}
