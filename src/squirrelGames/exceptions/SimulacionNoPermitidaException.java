package squirrelGames.exceptions;

public class SimulacionNoPermitidaException extends Exception {
   
	private static final long serialVersionUID = 1L;

	public SimulacionNoPermitidaException(String mensaje) {
        super(mensaje);
    }
}