package squirrelGames.integrantesJuego.pinkGuardsRanks;

import squirrelGames.integrantesJuego.PinkGuard;

public class Worker extends PinkGuard {

    private String departamento;


    public Worker(String id, String nombre, String apellidos, String departamento) {

        super(id, nombre, apellidos, "Worker");
        this.departamento = departamento;

    }

}
