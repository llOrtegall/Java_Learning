package org.ortega.Herencia;

public class Alumno extends Persona {
  private String institucion;
  private double notaMatematicas;
  private double notaCiencias;
  private double notaHistoria;

  public Alumno(String nombres, String apellidos ){
    super(nombres, apellidos);
  }

  public Alumno(String nombres, String apellidos, int edad){
    super(nombres, apellidos, edad);
  }

  public Alumno(String nombres, String apellidos, int edad, String institucion){
    super(nombres, apellidos, edad);
    this.institucion = institucion;
  }

  public Alumno(String nombres, String apellidos, int edad, String institucion, double notaMatematicas, double notaCiencias, double notaHistoria){
    this(nombres, apellidos, edad, institucion);
    this.notaMatematicas = notaMatematicas;
    this.notaCiencias = notaCiencias;
    this.notaHistoria = notaHistoria;
  }

  public String getInstitucion() {
    return institucion;
  }

  public void setInstitucion(String institucion) {
    this.institucion = institucion;
  }

  public double getNotaMatematicas() {
    return notaMatematicas;
  }

  public void setNotaMatematicas(double notaMatematicas) {
    this.notaMatematicas = notaMatematicas;
  }

  public double getNotaCiencias() {
    return notaCiencias;
  }

  public void setNotaCiencias(double notaCiencias) {
    this.notaCiencias = notaCiencias;
  }

  public double getNotaHistoria() {
    return notaHistoria;
  }

  public void setNotaHistoria(double notaHistoria) {
    this.notaHistoria = notaHistoria;
  }

  @Override
  public String saludar() {
    return "Hola, soy un alumno y me llamo " + getNombres() + " " + getApellidos() + ". Tengo " + getEdad() + " años y estudio en " + getInstitucion() + ".";
  }
}
