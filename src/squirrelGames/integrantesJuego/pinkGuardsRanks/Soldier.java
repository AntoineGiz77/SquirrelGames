package squirrelGames.integrantesJuego.pinkGuardsRanks;

import squirrelGames.integrantesJuego.PinkGuard;

public class Soldier extends PinkGuard {

    private ArmasSoldier arma;
    private int municion;

    public Soldier(String id, String nombre, String apellidos, String arma, int municion) {

        super (id, nombre, apellidos, "Soldier");
        this.arma = ArmasSoldier.valueOf(arma);
        this.municion = municion;

    }

    public void setArma(ArmasSoldier arma) {

        this.arma = arma;

    }

    public int getMunicion() {

        return municion;

    }

    public void setMunicion(int municion) {

        this.municion = municion;

    }
}
