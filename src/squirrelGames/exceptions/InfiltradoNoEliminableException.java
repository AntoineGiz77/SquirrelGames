package squirrelGames.exceptions;

public class InfiltradoNoEliminableException extends Exception {
    private static final long serialVersionUID = 1L;

    private final String nombreParticipante;
    private final String nombreReal;

    public InfiltradoNoEliminableException(String mensaje, String nombreParticipante, String nombreReal) {
        super(mensaje + " " + nombreParticipante + " (Nombre real: " + nombreReal + ")");
        this.nombreParticipante = nombreParticipante;
        this.nombreReal = nombreReal;
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public String getNombreReal() {
        return nombreReal;
    }
}



