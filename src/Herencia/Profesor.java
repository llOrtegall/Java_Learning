package Herencia;

public class Profesor extends Persona {
  private String asigtura;

  public Profesor(){
    System.out.println("Inicializando contructor de Profesor");
  }

  public Profesor(String nombres, String apellidos ){
    super(nombres, apellidos);
  }

  public Profesor(String nombres, String apellidos, int edad){
    super(nombres, apellidos, edad);

  }

  public Profesor(String nombres, String apellidos, int edad, String asigtura){
    this(nombres, apellidos, edad); /* TODO: hace referencia al segundo contructor */
    this.asigtura = asigtura;
  }

  public String getAsigtura() {
    return asigtura;
  }

  public void setAsigtura(String asigtura) {
    this.asigtura = asigtura;
  }
}
