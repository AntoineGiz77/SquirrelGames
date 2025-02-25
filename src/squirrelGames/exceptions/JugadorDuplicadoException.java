package squirrelGames.exceptions;

public class JugadorDuplicadoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public JugadorDuplicadoException(String mensaje) {
		super(mensaje);
	}
}
