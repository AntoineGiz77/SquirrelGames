package squirrelGames.integrantesJuego.pinkGuardsRanks;

import squirrelGames.integrantesJuego.PinkGuard;

import java.util.ArrayList;
import java.util.List;

public class Manager extends PinkGuard {

    private ArmasManager arma;
    private int municion;
    private List<PinkGuard> equipo;


    public Manager(String id, String nombre, String apellidos, String arma, int municion) {

        super(id, nombre, apellidos, "Manager");
        this.arma = this.arma;
        this.municion = municion;
        this.equipo = new ArrayList<>();
        this.apellidos = apellidos;
    }

    public String getApellido() {

        return apellidos;

    }
}
