package squirrelGames.exceptions;

/**
 * Excepción que se lanza cuando se intenta eliminar a un participante infiltrado que no puede ser eliminado.
 * Esta excepción incluye el nombre del participante y su nombre real como información adicional.
 */
public class InfiltradoNoEliminableException extends Exception {
	
	/**
	 * Identificador único de versión para la serialización.
	 */
    private static final long serialVersionUID = 1L;
    
    /**
     * El nombre del participante infiltrado.
     */
    private final String nombreParticipante;
    
    /**
     * El nombre real del participante infiltrado.
     */
    private final String nombreReal;

    /**
     * Constructor de la excepción InfiltradoNoEliminableException.
     * 
     * @param mensaje El mensaje que describe el motivo de la excepción.
     * @param nombreParticipante El nombre del participante infiltrado.
     * @param nombreReal El nombre real del participante infiltrado.
     */
    public InfiltradoNoEliminableException(String mensaje, String nombreParticipante, String nombreReal) {
        super(mensaje + " " + nombreParticipante + " (Nombre real: " + nombreReal + ")");
        this.nombreParticipante = nombreParticipante;
        this.nombreReal = nombreReal;
    }

    /**
     * Obtiene el nombre del participante infiltrado.
     * 
     * @return El nombre del participante infiltrado.
     */
    public String getNombreParticipante() {
        return nombreParticipante;
    }

    /**
     * Obtiene el nombre real del participante infiltrado.
     * 
     * @return El nombre real del participante infiltrado.
     */
    public String getNombreReal() {
        return nombreReal;
    }
}
