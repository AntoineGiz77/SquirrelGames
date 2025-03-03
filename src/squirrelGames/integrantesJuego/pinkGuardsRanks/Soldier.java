package squirrelGames.integrantesJuego.pinkGuardsRanks;

import squirrelGames.integrantesJuego.PinkGuard;

/**
 * Clase que representa a un Pink Guard con el rango de "Soldier".
 * Los Soldiers tienen acceso a un arma y munición para realizar tareas específicas.
 */
public class Soldier extends PinkGuard {

	/**
	 * Arma equipada por el soldado.
	 */
	private ArmasSoldier arma;

	/**
	 * Munición disponible para el soldado.
	 */
	private int municion;


    /**
     * Constructor de la clase Soldier.
     * 
     * @param id Identificador único del Soldier.
     * @param nombre Nombre del Soldier.
     * @param apellidos Apellidos del Soldier.
     * @param arma Nombre del arma asignada al Soldier (en formato String).
     * @param municion Cantidad de munición inicial para el arma.
     */
    public Soldier(String id, String nombre, String apellidos, String arma, int municion) {
        super(id, nombre, apellidos, "Soldier");
        this.arma = ArmasSoldier.valueOf(arma); 
        this.municion = municion;
    }

    /**
     * Establece el arma del Soldier.
     * 
     * @param arma El arma que se asignará al Soldier.
     */
    public void setArma(ArmasSoldier arma) {
        this.arma = arma;
    }

    /**
     * Obtiene la cantidad de munición disponible para el Soldier.
     * 
     * @return Cantidad de munición.
     */
    public int getMunicion() {
        return municion;
    }

    /**
     * Establece la cantidad de munición disponible para el Soldier.
     * 
     * @param municion La cantidad de munición que se asignará.
     */
    public void setMunicion(int municion) {
        this.municion = municion;
    }
}
