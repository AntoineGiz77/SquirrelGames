package squirrelGames.integrantesJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import squirrelGames.exceptions.SupervisorInvalidoException;

class PinkGuardTest {

	// Testeo para probar la exception de Supervisor no valido
	
	@Test
	@DisplayName("Prueba para intentar asignar a un PinkGuard un supervisor invalido")
	public void ponerSupervisorInvalkido() throws SupervisorInvalidoException {
		 PinkGuard subordinado = new PinkGuard("411", "David", "Perez", "worker");
		 PinkGuard supervisornovalido = new PinkGuard ("91", "Antoine" , "Giz" , "worker");
		 assertThrows(SupervisorInvalidoException.class, () -> subordinado.setSupervisor(supervisornovalido));
	}
	
	//Testeo para probar a crear un PinkGuard con Supervisor valido
	
	@Test
	@DisplayName("Prueba para asignar a un PinkGuard un supervisor valido")
	public void ponerSupervisorValido() throws SupervisorInvalidoException {
		
		PinkGuard subordinado = new PinkGuard("411", "David", "Perez", "worker");
	    PinkGuard supervisorValido = new PinkGuard("91", "Felipe", "Coronado", "manager");
	    assertDoesNotThrow(() -> subordinado.setSupervisor(supervisorValido));
	    assertEquals(supervisorValido, subordinado.getSupervisor());
	}
	
}
