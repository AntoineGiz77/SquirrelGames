package squirrelGames;

import squirrelGames.exceptions.InfiltradoNoEliminableException;

public class Participantes {
    private String id  ;
    private String nombre;
    private String apellidos;
    private String birthDate;
    private String genero;
    private String nacionalidad;
    private double deuda;
    private boolean esInfiltrado;
    private String nombreReal;

    public Participantes(String id, String nombre, String apellidos, String birthDate, String genero, String nacionalidad, double deuda, boolean esInfiltrado, String nombreReal){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.birthDate = birthDate;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.deuda = deuda;
        this.esInfiltrado = esInfiltrado;
        this.nombreReal = esInfiltrado ? nombreReal : null;

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

    public String getBirthDate() {

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

    public boolean isEsInfiltrado() {

        return esInfiltrado;

    }

    public String getNombreReal(){

        return nombreReal;

   }

   public void setNombre() {

        this.nombre = nombre;

   }

   public void setApellidos() {

        this.apellidos = apellidos;

   }

   public void setGenero() {

        this.genero = genero;

   }

   public void setNacionalidad() {

        this.nacionalidad = nacionalidad;

   }

   public void setDeuda(double deuda) {

        this.deuda = deuda;

   }

   public void eliminar() throws InfiltradoNoEliminableException {
       if (this.esInfiltrado) {
           throw new InfiltradoNoEliminableException("No puedes eliminar a un infiltrado: " + this.nombre);
       }
       System.out.println(this.nombre + " ha sido eliminado del juego.");
   }

}
