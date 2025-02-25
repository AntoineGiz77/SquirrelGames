package squirrelGames;

import squirrelGames.exceptions.InfiltradoNoEliminableException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Participantes {
    private String id  ;
    private String nombre;
    private String apellidos;
    private LocalDate birthDate;
    private String genero;
    private String nacionalidad;
    private double deuda;
    private EstadoParticipante estado;
    private String nombreReal;

    public Participantes(String id, String nombre, String apellidos, LocalDate birthDate, String genero, String nacionalidad, double deuda, EstadoParticipante estado, String nombreReal){
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

    public String getId() {

        return id;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellidos() {

        return apellidos;

    }

    public LocalDate getBirthDate() {

        return birthDate;

    }

    public String getGenero() {

        return genero;

    }

    public String getNacionalidad() {

        return nacionalidad;

    }

    public double getDeuda() {

        return deuda;

    }


    public String getNombreReal(){

        return nombreReal;

   }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }


    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }


    public void setGenero(String genero) {

        this.genero = genero;

    }


    public void setNacionalidad(String nacionalidad) {

        this.nacionalidad = nacionalidad;

    }

   public void setDeuda(double deuda) {

        this.deuda = deuda;

   }

   public void eliminar() throws InfiltradoNoEliminableException {
       if (this.estado == EstadoParticipante.INFILTRADO) {
           throw new InfiltradoNoEliminableException("No puedes eliminar a un infiltrado: " + this.nombre);
       }
       System.out.println(this.nombre + " ha sido eliminado del juego.");
   }


    public String getFormattedBirthDate() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return birthDate.format(formatter);

    }

}
