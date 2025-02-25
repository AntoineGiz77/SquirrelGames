package squirrelGames.pinkGuardsRanks;

import squirrelGames.PinkGuard;

public class Soldier extends PinkGuard {

    private String arma;
    private int municion;

    public Soldier(String id, String nombre, String apellidos, String arma, int municion) {

        super (id, nombre, apellidos, "Soldier");
        this.arma = arma;
        this.municion = municion;

    }

}
