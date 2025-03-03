package squirrelGames.integrantesJuego.pinkGuardsRanks;

import squirrelGames.integrantesJuego.PinkGuard;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un Pink Guard con el rango de "Manager".
 * Los Managers tienen acceso a un arma, munición y la capacidad de liderar un equipo.
 */
public class Manager extends PinkGuard {
	
	/**
	 * Arma asignada al Manager
	 */
    private ArmasManager arma; 
    
    /**
	 * Cantidad de munición disponible para el arma
	 */
    private int municion; 
    
    /**
	 * Equipo de Pink Guards bajo el mando del Manager
	 */
    private List<PinkGuard> equipo; 

    /**
     * Constructor de la clase Manager.
     * 
     * @param id Identificador único del Manager.
     * @param nombre Nombre del Manager.
     * @param apellidos Apellidos del Manager.
     * @param arma Nombre del arma asignada al Manager (en formato String).
     * @param municion Cantidad de munición inicial para el arma.
     */
    public Manager(String id, String nombre, String apellidos, String arma, int municion) {
        super(id, nombre, apellidos, "Manager");
        this.arma = ArmasManager.valueOf(arma); 
        this.municion = municion;
        this.equipo = new ArrayList<>(); 
    }

    /**
     * Obtiene los apellidos del Manager.
     * 
     * @return Apellidos del Manager.
     */
    public String getApellido() {
        return apellidos;
    }

}
