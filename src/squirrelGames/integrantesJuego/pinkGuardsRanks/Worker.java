package squirrelGames.integrantesJuego.pinkGuardsRanks;

import squirrelGames.integrantesJuego.PinkGuard;

/**
 * Clase que representa a un Pink Guard con el rango de "Worker".
 * Los Workers están asignados a un departamento específico dentro de la estructura del juego.
 */
public class Worker extends PinkGuard {
	
	/**
	 * El departamento al que pertenece el trabajador.
	 */
    private String departamento;

    /**
     * Constructor de la clase Worker.
     * 
     * @param id Identificador único del Worker.
     * @param nombre Nombre del Worker.
     * @param apellidos Apellidos del Worker.
     * @param departamento Nombre del departamento al que el Worker está asignado.
     */
    public Worker(String id, String nombre, String apellidos, String departamento) {
        super(id, nombre, apellidos, "Worker");
        this.departamento = departamento;
    }

    /**
     * Obtiene el departamento al que está asignado el Worker.
     * 
     * @return El nombre del departamento.
     */
    public String getDepartamento() {
        return departamento;
    }
}
