package squirrelGames.juegos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import squirrelGames.integrantesJuego.EstadoParticipante;
import squirrelGames.integrantesJuego.Participantes;
import squirrelGames.integrantesJuego.PinkGuard;

class JuegosTest {

// Testeo para probar el añadir un PinkGuard a unos juegos
	@Test
	@DisplayName("Prueba para agregar un PinkGuards a unos juegos")
	public void testAgregarunPinkGuard() {
	    Juegos juego = new Juegos(2050, "Japon");
	    PinkGuard guardia = new PinkGuard("182", "Mario", "Bros", "manager");
	    juego.agregarPinkGuard(guardia);
	    assertEquals(1, juego.getPinkGuards().size());
	    assertEquals(guardia, juego.getPinkGuards().get(0));
	}

	
	//Testeo para probar el añadir un participante a unos juegos
	@Test
	@DisplayName("Prueba para agregar un participante a unos juegos")
	public void testAgregarunparticipante () {
		Juegos juego = new Juegos (2026 , "Mostoles");
		Participantes p1 = new Participantes("214", "Ibai" , "Llanos" , LocalDate.of(1999, 9, 19) , "Masculino", "Español" , 1000000 , EstadoParticipante.NORMAL , "Ibai" ); 
		juego.agregarParticipante(p1);
	    assertEquals(1, juego.getParticipantes().size());
	    assertEquals(p1, juego.getParticipantes().get(0));
	}
}
