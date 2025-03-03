package squirrelGames.juegos;

import squirrelGames.integrantesJuego.Participantes;
import squirrelGames.integrantesJuego.PinkGuard;
import squirrelGames.pruebas.Pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un juego en el sistema. Un juego se asocia a un año, una ubicación, 
 * y mantiene listas de participantes, Pink Guards y pruebas asociadas.
 */
public class Juegos {

	/**
	 * Año en que se juega el evento.
	 */
	private int year;
    
    /**
     * Ubicación del juego.
     */
    private String ubicacion;    
    
    /**
     * Lista de participantes en el juego.
     */
    private List<Participantes> participantes;
    
    /**
     * Lista de Pink Guards en el juego.
     */
    private List<PinkGuard> pinkGuards;
    
    /**
     * Lista de pruebas realizadas en el juego.
     */
    private List<Pruebas> pruebas;

    /**
     * Constructor de la clase Juegos. Inicializa los campos de año, ubicación y las listas
     * vacías de participantes, Pink Guards y pruebas.
     *
     * @param year     El año en el que se celebra el juego.
     * @param ubicacion La ubicación donde se celebra el juego.
     */
    public Juegos(int year, String ubicacion) {
        this.year = year;
        this.ubicacion = ubicacion;
        this.participantes = new ArrayList<>();
        this.pinkGuards = new ArrayList<>();
        this.pruebas = new ArrayList<>();
    }

    /**
     * Obtiene el año en el que se celebra el juego.
     *
     * @return El año del juego.
     */
    public int getYear() {
        return year;
    }

    /**
     * Obtiene la ubicación del juego.
     *
     * @return La ubicación del juego.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Agrega un participante a la lista de participantes del juego.
     *
     * @param participantes El participante a agregar.
     */
    public void agregarParticipante(Participantes participantes) {
        this.participantes.add(participantes);
    }

    /**
     * Agrega un Pink Guard a la lista de Pink Guards del juego.
     *
     * @param pinkGuard El Pink Guard a agregar.
     */
    public void agregarPinkGuard(PinkGuard pinkGuard) {
        this.pinkGuards.add(pinkGuard);
    }

    /**
     * Agrega una prueba a la lista de pruebas del juego.
     *
     * @param pruebas La prueba a agregar.
     */
    public void agregarPruebas(Pruebas pruebas) {
        this.pruebas.add(pruebas);
    }

    /**
     * Obtiene la lista de participantes del juego.
     *
     * @return Lista de participantes.
     */
    public List<Participantes> getParticipantes() {
        return participantes;
    }

    /**
     * Obtiene la lista de Pink Guards del juego.
     *
     * @return Lista de Pink Guards.
     */
    public List<PinkGuard> getPinkGuards() {
        return pinkGuards;
    }

    /**
     * Obtiene la lista de pruebas del juego.
     *
     * @return Lista de pruebas.
     */
    public List<Pruebas> getPruebas() {
        return pruebas;
    }
}
