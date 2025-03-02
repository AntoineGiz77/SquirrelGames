package squirrelGames.juegos;

import squirrelGames.integrantesJuego.Participantes;
import squirrelGames.integrantesJuego.PinkGuard;
import squirrelGames.pruebas.Pruebas;

import java.util.ArrayList;
import java.util.List;

public class Juegos {

    private int year;
    private String ubicacion;
    private List<Participantes> participantes;
    private List<PinkGuard> pinkGuards;
    private List<Pruebas> pruebas;


    public Juegos(int year, String ubicacion) {

        this.year = year;
        this.ubicacion = ubicacion;
        this.participantes = new ArrayList<>();
        this.pinkGuards = new ArrayList<>();
        this.pruebas = new ArrayList<>();

    }


    public int getYear() {

        return year;

    }

    public String getUbicacion() {

        return ubicacion;

    }

    public void agregarParticipante(Participantes participantes) {

        this.participantes.add(participantes);

    }

    public void agregarPinkGuard(PinkGuard pinkGuard) {

        this.pinkGuards.add(pinkGuard);

    }

    public void agregarPruebas(Pruebas pruebas) {

        this.pruebas.add(pruebas);

    }

    public List<Participantes> getParticipantes() {

        return participantes;

    }


    public List<PinkGuard> getPinkGuards() {

        return pinkGuards;

    }

    public List<Pruebas> getPruebas() {

        return pruebas;

    }


}
