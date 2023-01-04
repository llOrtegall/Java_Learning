package Herencia;

public class Profesor extends Persona {
  private String asigtura;

  public Profesor(){
    System.out.println("Inicializando contructor de Profesor");
  }

  public String getAsigtura() {
    return asigtura;
  }

  public void setAsigtura(String asigtura) {
    this.asigtura = asigtura;
  }
}
