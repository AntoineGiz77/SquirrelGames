package squirrelGames.integrantesJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import squirrelGames.exceptions.SupervisorInvalidoException;

class PinkGuardTest {

	// Testeo para probar la exception de Supervisor no valido
	
	@Test
	void asignarSupervisorinvalido() throws SupervisorInvalidoException {
		 PinkGuard subordinado = new PinkGuard("411", "David", "Perez", "worker");
		 PinkGuard supervisornovalido = new PinkGuard ("91", "Antoine" , "Giz" , "worker");
		 
		 assertThrows(SupervisorInvalidoException.class, () -> subordinado.setSupervisor(supervisornovalido));

		
	}
	
}
