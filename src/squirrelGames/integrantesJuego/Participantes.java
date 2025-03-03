package squirrelGames.integrantesJuego;

import squirrelGames.exceptions.InfiltradoNoEliminableException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa a un participante dentro del juego.
 * Los participantes tienen diversos atributos como nombre, fecha de nacimiento, 
 * deuda y estado, entre otros. Esta clase también incluye un método para eliminar 
 * a los participantes, teniendo en cuenta su estado.
 */
public class Participantes {
	
	/**
	 * Apellidos del participante.
	 */
	private String apellidos;

	/**
	 * Fecha de nacimiento del participante.
	 */
	private LocalDate birthDate;

	/**
	 * Deuda del participante.
	 */
	private double deuda;

	/**
	 * Estado del participante (activo, eliminado, etc.).
	 */
	private EstadoParticipante estado;

	/**
	 * Género del participante.
	 */
	private String genero;

	/**
	 * Identificador único del participante.
	 */
	private String id;

	/**
	 * Nacionalidad del participante.
	 */
	private String nacionalidad;

	/**
	 * Nombre del participante.
	 */
	private String nombre;

	/**
	 * Nombre real del participante.
	 */
	private String nombreReal;


    /**
     * Constructor de la clase Participantes.
     * 
     * @param id El identificador único del participante.
     * @param nombre El nombre del participante.
     * @param apellidos Los apellidos del participante.
     * @param birthDate La fecha de nacimiento del participante.
     * @param genero El género del participante.
     * @param nacionalidad La nacionalidad del participante.
     * @param deuda La deuda del participante.
     * @param estado El estado del participante (por ejemplo, INFILTRADO o NORMAL).
     * @param nombreReal El nombre real del participante, utilizado solo si el estado es INFILTRADO.
     */
    public Participantes(String id, String nombre, String apellidos, LocalDate birthDate, String genero, String nacionalidad, double deuda, EstadoParticipante estado, String nombreReal) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.birthDate = birthDate;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.deuda = deuda;
        this.estado = estado;
        this.nombreReal = (estado == EstadoParticipante.INFILTRADO) ? nombreReal : null;
    }

    /**
     * Obtiene el identificador único del participante.
     * 
     * @return El identificador del participante.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el nombre del participante.
     * 
     * @return El nombre del participante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los apellidos del participante.
     * 
     * @return Los apellidos del participante.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene la fecha de nacimiento del participante.
     * 
     * @return La fecha de nacimiento del participante.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Obtiene el género del participante.
     * 
     * @return El género del participante.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Obtiene la nacionalidad del participante.
     * 
     * @return La nacionalidad del participante.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Obtiene la deuda del participante.
     * 
     * @return La deuda del participante.
     */
    public double getDeuda() {
        return deuda;
    }

    /**
     * Obtiene el nombre real del participante si está en estado INFILTRADO.
     * 
     * @return El nombre real del participante, o null si no está infiltrado.
     */
    public String getNombreReal() {
        return nombreReal;
    }

    /**
     * Establece un nuevo nombre para el participante.
     * 
     * @param nombre El nuevo nombre del participante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece los nuevos apellidos del participante.
     * 
     * @param apellidos Los nuevos apellidos del participante.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Establece el nuevo género del participante.
     * 
     * @param genero El nuevo género del participante.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Establece la nueva nacionalidad del participante.
     * 
     * @param nacionalidad La nueva nacionalidad del participante.
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Establece la nueva deuda del participante.
     * 
     * @param deuda La nueva deuda del participante.
     */
    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    /**
     * Elimina al participante del juego si su estado es NORMAL.
     * Si el participante está en estado INFILTRADO, se lanza una excepción {@link InfiltradoNoEliminableException}.
     * 
     * @throws InfiltradoNoEliminableException Si el participante está en estado INFILTRADO.
     */
    public void eliminar() throws InfiltradoNoEliminableException {
        if (this.estado == EstadoParticipante.INFILTRADO) {
            throw new InfiltradoNoEliminableException("No puedes eliminar a un infiltrado:", this.nombre, this.nombreReal);
        }
        System.out.println(this.nombre + " ha sido eliminado del juego.");
    }

    /**
     * Obtiene la fecha de nacimiento del participante en formato "dd/MM/yyyy".
     * 
     * @return La fecha de nacimiento formateada del participante.
     */
    public String getFormattedBirthDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return birthDate.format(formatter);
    }

    /**
     * Obtiene el estado actual del participante.
     * 
     * @return El estado del participante (INFILTRADO o NORMAL).
     */
    public EstadoParticipante getEstado() {
        return estado;
    }
}

