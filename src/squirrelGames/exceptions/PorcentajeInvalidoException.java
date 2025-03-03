package squirrelGames.exceptions;

/**
 * Excepción que se lanza cuando un porcentaje proporcionado es inválido.
 * Esta excepción incluye un mensaje que describe el motivo del error.
 */
public class PorcentajeInvalidoException extends Exception {
    
	/**
	 * Identificador único de versión para la serialización.
	 */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la excepción PorcentajeInvalidoException.
     * 
     * @param mensaje El mensaje que describe el motivo de la excepción.
     */
    public PorcentajeInvalidoException(String mensaje) {
        super(mensaje);
    }
}
