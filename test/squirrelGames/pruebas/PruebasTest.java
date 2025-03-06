package squirrelGames.pruebas;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import squirrelGames.exceptions.InfiltradoNoEliminableException;
import squirrelGames.exceptions.JugadorDuplicadoException;
import squirrelGames.exceptions.PorcentajeInvalidoException;
import squirrelGames.exceptions.SimulacionNoPermitidaException;
import squirrelGames.integrantesJuego.EstadoParticipante;
import squirrelGames.integrantesJuego.Participantes;
import squirrelGames.integrantesJuego.pinkGuardsRanks.Manager;

class PruebasTest {

private Pruebas prueba;
private Pruebas pruebasinmanager;
private Manager manager1;
	

@BeforeEach
void setup() {
	manager1 = new Manager ("Jefazo", "Cristiano" , "Ronaldo dos Santos", "WessonModel10" , 50);
	prueba = new Pruebas ("Gol en porteria", "Prueba de punteria", manager1);
	pruebasinmanager = new Pruebas("Pruebas de testeo sin un manager" , "Prueba testeo", null);
}

//Testeo para crear un participante
@Test
@DisplayName("Prueba de creacion de un participante (Buscando la excepcion)")
public void inscribir1ParticipanteCorrectamente() throws JugadorDuplicadoException {
    Participantes p1 = new Participantes("100", "Joselito" , "Gutierrez Perez" , LocalDate.of(1995, 6, 15) , "Masculino", "Venezolano" , 40000 , EstadoParticipante.NORMAL , "Joselito" );
    prueba.inscribirParticipante(p1);
    assertEquals(1, prueba.getParticipantesInscritos().size());
}


//Testeo para comprobar lo mismo pero estando duplicado
@Test
@DisplayName("Prueba para intentar añadir un participante duplicado")
public void inscribir1Participanteyaexistente() throws JugadorDuplicadoException {
	Participantes p1 = new Participantes("100", "Joselito" , "Gutierrez Perez" , LocalDate.of(1995, 6, 15) , "Masculino", "Venezolano" , 40000 , EstadoParticipante.NORMAL , "Joselito" );
	prueba.inscribirParticipante(p1);
	 assertThrows(JugadorDuplicadoException.class, () -> prueba.inscribirParticipante(p1));
}

//Testeo para comprobar la excepcion del porcentaje
@Test
@DisplayName("Prueba para comprobar el limite de porcentaje de una prueba")
public void simularPruebaConPorcentajeInvalido() throws PorcentajeInvalidoException {
	assertThrows(PorcentajeInvalidoException.class, () -> prueba.simular(1.5));
}

//Testeo para evitar eliminar un infiltrado y que salte un Exception
@Test
@DisplayName("Prueba para intentar eliminar un infiltrado")
public void testEliminarInfiltradoLanzaExcepcion() throws JugadorDuplicadoException, InfiltradoNoEliminableException {
 
    Participantes infiltrado = new Participantes("101", "Lionel", "Andres Messi", LocalDate.of(1987, 6, 24), "Masculino", "Argentino", 50000000, EstadoParticipante.INFILTRADO, "Infiltrado");
    prueba.inscribirParticipante(infiltrado);
    assertTrue(prueba.getParticipantesInscritos().contains(infiltrado));
    assertThrows(InfiltradoNoEliminableException.class, () -> prueba.simular(1.0));
}

//Testeo para probar la excepcion Simulacion no permitida (no hay manager)
@Test 
@DisplayName("Prueba para probar una simulacion sin manager")
public void simularSinManagerLanzaExcepcion() throws SimulacionNoPermitidaException {
    assertThrows(SimulacionNoPermitidaException.class, () -> pruebasinmanager.simular(0.5));
}
}
