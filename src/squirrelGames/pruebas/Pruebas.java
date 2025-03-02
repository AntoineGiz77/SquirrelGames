package squirrelGames.pruebas;

import squirrelGames.integrantesJuego.EstadoParticipante;
import squirrelGames.integrantesJuego.Participantes;
import squirrelGames.exceptions.InfiltradoNoEliminableException;
import squirrelGames.exceptions.JugadorDuplicadoException;
import squirrelGames.exceptions.PorcentajeInvalidoException;
import squirrelGames.exceptions.SimulacionNoPermitidaException;
import squirrelGames.integrantesJuego.pinkGuardsRanks.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pruebas {
    private String nombre;
    private String descripcion;
    private List<Participantes> participantesInscritos = new ArrayList<>();
    private List<Participantes> eliminados = new ArrayList<>();
    private List<Participantes> vencedores = new ArrayList<>();
    private Manager responsable;

    public Pruebas(String nombre, String descripcion, Manager responsable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.responsable = responsable;
        this.participantesInscritos = new ArrayList<>();
        this.eliminados = new ArrayList<>();
        this.vencedores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Participantes> getParticipantesInscritos() {
        return participantesInscritos;
    }

    public List<Participantes> getEliminados() {
        return eliminados;
    }

    public List<Participantes> getVencedores() {
        return vencedores;
    }

    public Manager getResponsable() {
        return responsable;
    }

    public void inscribirParticipante(Participantes participante) throws JugadorDuplicadoException {
    	for (Participantes p : participantesInscritos) {
            if (p.getId().equals(participante.getId())) { 
                throw new JugadorDuplicadoException("El jugador con ID " + participante.getId() + " ya está inscrito.");
            }
        }
        participantesInscritos.add(participante);
    }

    public int simular(double porcentajeEliminados) throws InfiltradoNoEliminableException, SimulacionNoPermitidaException, PorcentajeInvalidoException {
        if (responsable == null) {
            throw new SimulacionNoPermitidaException("No se puede simular la prueba sin un Manager asignado.");
        }
        
        if (porcentajeEliminados < 0 || porcentajeEliminados > 1) {
            throw new PorcentajeInvalidoException("El porcentaje de eliminados debe estar entre 0 y 1.");
        }



        Random random = new Random();
        List<Participantes> eliminables = new ArrayList<>();

        for (Participantes participante : participantesInscritos) {
            if (participante.getEstado() == EstadoParticipante.INFILTRADO) {
            	throw new InfiltradoNoEliminableException("No se puede eliminar al participante infiltrado:",participante.getNombre(),participante.getNombreReal());
            	}
            eliminables.add(participante);
        }

        int totalEliminados = (int) (participantesInscritos.size() * porcentajeEliminados);
        totalEliminados = Math.min(totalEliminados, eliminables.size());

        for (int i = 0; i < totalEliminados; i++) {
            int index = random.nextInt(eliminables.size());
            Participantes eliminado = eliminables.remove(index);
            participantesInscritos.remove(eliminado);
            eliminados.add(eliminado);
        }

        vencedores.addAll(participantesInscritos);

        return totalEliminados;
    }

    public double calcularPorcentajeExito() {
        if (vencedores.size() + eliminados.size() == 0) {
            return 0;
        }
        return (vencedores.size() * 100.0) / (vencedores.size() + eliminados.size());
    }

}