package squirrelGames.exceptions;

public class IdentificadorUnicoException extends Exception {
   
	private static final long serialVersionUID = 1L;

	public IdentificadorUnicoException(String mensaje) {
        super(mensaje);
    }
}