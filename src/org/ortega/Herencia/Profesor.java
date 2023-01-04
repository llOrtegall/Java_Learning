package org.ortega.Herencia;

public class Profesor extends Persona {
  private String asignatura;

  public Profesor(String nombres, String apellidos ){
    super(nombres, apellidos);
  }

  public Profesor(String nombres, String apellidos, int edad){
    super(nombres, apellidos, edad);

  }

  public Profesor(String nombres, String apellidos, int edad, String asigtura){
    this(nombres, apellidos, edad); /* TODO: hace referencia al segundo contructor */
    this.asignatura = asigtura;
  }

  public String getAsigtura() {
    return asignatura;
  }

  public void setAsigtura(String asigtura) {
    this.asignatura = asigtura;
  }

  @Override
  public String saludar() {
    return "Hola, soy un profesor y mi nombre es " + getNombres() + " " + getApellidos() + ". Tengo "
            + getEdad() + " años y enseño " + asignatura + ".";
  }
}
