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

/**
 * Clase que representa una prueba en el juego. Las pruebas son dirigidas por un responsable (Manager) 
 * y pueden tener participantes que pueden ser eliminados o convertirse en vencedores según el desarrollo de la prueba.
 */
public class Pruebas {
    
	/**
	 * Descripción de la prueba.
	 */
	private String descripcion;

	/**
	 * Lista de participantes eliminados en la prueba.
	 */
	private List<Participantes> eliminados = new ArrayList<>();

	/**
	 * Nombre de la prueba.
	 */
	private String nombre;

	/**
	 * Lista de participantes inscritos en la prueba.
	 */
	private List<Participantes> participantesInscritos = new ArrayList<>();

	/**
	 * Persona responsable de la prueba.
	 */
	private Manager responsable;

	/**
	 * Lista de participantes ganadores de la prueba.
	 */
	private List<Participantes> vencedores = new ArrayList<>();


    /**
     * Constructor de la clase Pruebas. Inicializa la prueba con nombre, descripción y responsable.
     *
     * @param nombre       El nombre de la prueba.
     * @param descripcion La descripción de la prueba.
     * @param responsable El responsable (Manager) de la prueba.
     */
    public Pruebas(String nombre, String descripcion, Manager responsable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.responsable = responsable;
        this.participantesInscritos = new ArrayList<>();
        this.eliminados = new ArrayList<>();
        this.vencedores = new ArrayList<>();
    }

    /**
     * Obtiene el nombre de la prueba.
     *
     * @return El nombre de la prueba.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción de la prueba.
     *
     * @return La descripción de la prueba.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene la lista de participantes inscritos en la prueba.
     *
     * @return La lista de participantes inscritos.
     */
    public List<Participantes> getParticipantesInscritos() {
        return participantesInscritos;
    }

    /**
     * Obtiene la lista de participantes eliminados en la prueba.
     *
     * @return La lista de participantes eliminados.
     */
    public List<Participantes> getEliminados() {
        return eliminados;
    }

    /**
     * Obtiene la lista de vencedores de la prueba.
     *
     * @return La lista de vencedores de la prueba.
     */
    public List<Participantes> getVencedores() {
        return vencedores;
    }

    /**
     * Obtiene el responsable (Manager) de la prueba.
     *
     * @return El responsable de la prueba.
     */
    public Manager getResponsable() {
        return responsable;
    }

    /**
     * Inscribe un participante en la prueba. Si el participante ya está inscrito, lanza una excepción.
     *
     * @param participante El participante a inscribir.
     * @throws JugadorDuplicadoException Si el jugador ya está inscrito.
     */
    public void inscribirParticipante(Participantes participante) throws JugadorDuplicadoException {
        for (Participantes p : participantesInscritos) {
            if (p.getId().equals(participante.getId())) {
                throw new JugadorDuplicadoException("El jugador con ID " + participante.getId() + " ya está inscrito.");
            }
        }
        participantesInscritos.add(participante);
    }

    /**
     * Simula el resultado de la prueba. Elimina un porcentaje de participantes de acuerdo a la simulación y determina los vencedores.
     * 
     * @param porcentajeEliminados El porcentaje de participantes que serán eliminados (entre 0 y 1).
     * @return El número total de participantes eliminados en la simulación.
     * @throws InfiltradoNoEliminableException Si un participante infiltrado no puede ser eliminado.
     * @throws SimulacionNoPermitidaException Si no se puede simular la prueba sin un responsable asignado.
     * @throws PorcentajeInvalidoException Si el porcentaje de eliminados no está entre 0 y 1.
     */
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
                throw new InfiltradoNoEliminableException("No se puede eliminar al participante infiltrado:", participante.getNombre(), participante.getNombreReal());
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

    /**
     * Calcula el porcentaje de éxito de la prueba, basado en el número de vencedores y eliminados.
     *
     * @return El porcentaje de éxito de la prueba.
     */
    public double calcularPorcentajeExito() {
        if (vencedores.size() + eliminados.size() == 0) {
            return 0;
        }
        return (vencedores.size() * 100.0) / (vencedores.size() + eliminados.size());
    }
}
