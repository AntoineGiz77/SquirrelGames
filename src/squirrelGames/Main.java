package squirrelGames;

import squirrelGames.exceptions.*;
import squirrelGames.integrantesJuego.*;
import squirrelGames.integrantesJuego.pinkGuardsRanks.*;
import squirrelGames.juegos.Juegos;
import squirrelGames.pruebas.Pruebas;
import java.time.LocalDate;

/**
 * La clase Main es la entrada principal de la simulación del juego de supervivencia.
 * Esta clase se encarga de crear los participantes, asignar pruebas, y simular los resultados.

 */
public class Main {
    
    /**
     * Método principal que ejecuta la simulación de las pruebas de los participantes.
     * Inicializa el juego, los participantes, los Pink Guards y las pruebas.
     * Lanza excepciones relacionadas con la simulación de las pruebas.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     * @throws JugadorDuplicadoException Si se detecta un jugador duplicado al agregarlo.
     * @throws SimulacionNoPermitidaException Si la simulación no es válida.
     * @throws PorcentajeInvalidoException Si el porcentaje de eliminados es inválido.
     */
    public static void main(String[] args) throws JugadorDuplicadoException, SimulacionNoPermitidaException, PorcentajeInvalidoException {
        try {
            // Creación del juego
            Juegos juego = new Juegos(2025, "Seúl");

            // Creación de participantes
            Participantes p1 = new Participantes("P001", "Juan", "Pérez", LocalDate.of(1990, 5, 10), "M", "España", 5000, EstadoParticipante.NORMAL, null);
            Participantes p2 = new Participantes("P002", "Juani", "López", LocalDate.of(1995, 7, 20), "F", "México", 0, EstadoParticipante.INFILTRADO, "María García");
            Participantes p3 = new Participantes("P003", "Carlos", "Gómez", LocalDate.of(1985, 11, 15), "M", "Argentina", 3000, EstadoParticipante.NORMAL, null);
            Participantes p4 = new Participantes("P004", "Sofía", "Martínez", LocalDate.of(1992, 3, 5), "F", "Colombia", 25000, EstadoParticipante.NORMAL, "Sofía López");
            Participantes p5 = new Participantes("P005", "Andrés", "Fernández", LocalDate.of(1988, 9, 22), "M", "Chile", 4500, EstadoParticipante.NORMAL, null);
            Participantes p6 = new Participantes("P006", "Lucía", "Hernández", LocalDate.of(1997, 12, 30), "F", "Perú", 6200, EstadoParticipante.NORMAL, null);
            Participantes p7 = new Participantes("P007", "Juan", "García", LocalDate.of(1991, 4, 18), "M", "España", 5000, EstadoParticipante.NORMAL, null);
            Participantes p8 = new Participantes("P008", "Rubén", "Ruiz", LocalDate.of(1996, 1, 10), "M", "China", 0, EstadoParticipante.INFILTRADO, "Joseba Flores");
            Participantes p9 = new Participantes("P009", "José", "López", LocalDate.of(1990, 6, 25), "M", "España", 5200, EstadoParticipante.NORMAL, null);
            Participantes p10 = new Participantes("P010", "Elena", "Pérez", LocalDate.of(1994, 2, 3), "F", "México", 12000, EstadoParticipante.NORMAL, null);

            // Agregar participantes al juego
            juego.agregarParticipante(p1);
            juego.agregarParticipante(p2);
            juego.agregarParticipante(p3);
            juego.agregarParticipante(p4);
            juego.agregarParticipante(p5);
            juego.agregarParticipante(p6);
            juego.agregarParticipante(p7);
            juego.agregarParticipante(p8);
            juego.agregarParticipante(p9);
            juego.agregarParticipante(p10);

            // Creación de Pink Guards
            Manager manager = new Manager("M001", "Carlos", "Gómez", "WessonModel10", 10);
            Soldier soldier = new Soldier("S001", "Luis", "Martínez", "MP5", 30);
            Worker worker = new Worker("W001", "Ana", "Rodríguez", "Limpieza y mantenimiento");

            // Asignación de Pink Guards al juego
            juego.agregarPinkGuard(manager);
            juego.agregarPinkGuard(soldier);
            juego.agregarPinkGuard(worker);

            // Asignación de supervisores
            soldier.setSupervisor(manager);
            worker.setSupervisor(manager);

            // Creación de pruebas
            Pruebas prueba1 = new Pruebas("Carrera de obstáculos", "Una prueba intensa con múltiples obstáculos.", manager);
            Pruebas prueba2 = new Pruebas("Prueba de resistencia", "Prueba donde los participantes deben resistir durante mucho tiempo.", manager);
            Pruebas prueba3 = new Pruebas("Juego de memoria", "Prueba donde se debe recordar secuencias complejas.", manager);
            Pruebas prueba4 = new Pruebas("Escape laberinto", "Prueba donde los jugadores deben encontrar la salida de un laberinto.", manager);

            // Inscripción de participantes a las pruebas
            prueba1.inscribirParticipante(p1);
            prueba1.inscribirParticipante(p2);
            prueba1.inscribirParticipante(p3);
            prueba1.inscribirParticipante(p4);
            prueba1.inscribirParticipante(p5);
            prueba1.inscribirParticipante(p6);
            prueba1.inscribirParticipante(p7);
            prueba1.inscribirParticipante(p8);
            prueba1.inscribirParticipante(p9);
            prueba1.inscribirParticipante(p10);

            // Inscripción para las demás pruebas
            prueba2.inscribirParticipante(p1);
            prueba2.inscribirParticipante(p2);
            prueba2.inscribirParticipante(p3);
            prueba2.inscribirParticipante(p4);
            prueba2.inscribirParticipante(p5);
            prueba2.inscribirParticipante(p6);
            prueba2.inscribirParticipante(p7);
            prueba2.inscribirParticipante(p8);
            prueba2.inscribirParticipante(p9);
            prueba2.inscribirParticipante(p10);

            prueba3.inscribirParticipante(p1);
            prueba3.inscribirParticipante(p2);
            prueba3.inscribirParticipante(p3);
            prueba3.inscribirParticipante(p4);
            prueba3.inscribirParticipante(p5);
            prueba3.inscribirParticipante(p6);
            prueba3.inscribirParticipante(p7);
            prueba3.inscribirParticipante(p8);
            prueba3.inscribirParticipante(p9);
            prueba3.inscribirParticipante(p10);

            prueba4.inscribirParticipante(p1);
            prueba4.inscribirParticipante(p2);
            prueba4.inscribirParticipante(p3);
            prueba4.inscribirParticipante(p4);
            prueba4.inscribirParticipante(p5);
            prueba4.inscribirParticipante(p6);
            prueba4.inscribirParticipante(p7);
            prueba4.inscribirParticipante(p8);
            prueba4.inscribirParticipante(p9);
            prueba4.inscribirParticipante(p10);

            // Agregar pruebas al juego
            juego.agregarPruebas(prueba1);
            juego.agregarPruebas(prueba2);
            juego.agregarPruebas(prueba3);
            juego.agregarPruebas(prueba4);

            // Simulación de las pruebas
            System.out.println("Simulando las pruebas...");
            try {
                simularPrueba(prueba1, 0.15);
                simularPrueba(prueba2, 0.25);
                simularPrueba(prueba3, 0.65);
                simularPrueba(prueba4, 0.8);
            } catch (InfiltradoNoEliminableException e) {
                System.err.println("Error al eliminar infiltrado: " + e.getMessage());
            }

        } catch (SupervisorInvalidoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Simula una prueba en el juego.
     * 
     * @param prueba La prueba a simular.
     * @param porcentajeEliminados El porcentaje de participantes eliminados en la prueba.
     * @throws InfiltradoNoEliminableException Si un infiltrado no puede ser eliminado.
     * @throws SimulacionNoPermitidaException Si la simulación no está permitida.
     * @throws PorcentajeInvalidoException Si el porcentaje de eliminados es inválido.
     */
    public static void simularPrueba(Pruebas prueba, double porcentajeEliminados) throws InfiltradoNoEliminableException, SimulacionNoPermitidaException, PorcentajeInvalidoException {
        try {
            int eliminados = prueba.simular(porcentajeEliminados);
            System.out.println("Prueba: " + prueba.getNombre());
            System.out.println("Descripción: " + prueba.getDescripcion());
            System.out.println("Número de eliminados: " + eliminados);
            System.out.println("Porcentaje de éxito: " + prueba.calcularPorcentajeExito() + "%");
            System.out.println("Eliminados:");

            for (Participantes eliminado : prueba.getEliminados()) {
                System.out.println("- " + eliminado.getNombre() + " " + eliminado.getApellidos());
            }

            System.out.println("Vencedores:");
            for (Participantes vencedor : prueba.getVencedores()) {
                System.out.println("- " + vencedor.getNombre() + " " + vencedor.getApellidos());
            }
            System.out.println();
        } catch (InfiltradoNoEliminableException e) {
            System.err.println("Error al intentar eliminar a un participante:");
            System.err.println("Nombre participante: " + e.getNombreParticipante());
            System.err.println("Nombre real: " + e.getNombreReal());
        }
    }
}
