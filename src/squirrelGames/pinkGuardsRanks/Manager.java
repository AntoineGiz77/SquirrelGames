package squirrelGames.pinkGuardsRanks;

import squirrelGames.PinkGuard;

import java.util.ArrayList;
import java.util.List;

public class Manager extends PinkGuard {

    private String arma;
    private int municion;
    private List<PinkGuard> equipo;


    public Manager(String id, String nombre, String apellidos, String arma, int municion) {

        super(id, nombre, apellidos, "Manager");
        this.arma = arma;
        this.municion = municion;
        this.equipo = new ArrayList<>();

    }
}
