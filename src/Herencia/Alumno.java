package Herencia;

public class Alumno extends Persona {
  private String institucion;
  private double notaMatematicas;
  private double notaHistoria;

  public Alumno(){
    System.out.println("Inicializando contructor de Alumno");
  }

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

  public double getNotaHistoria() {
    return notaHistoria;
  }

  public void setNotaHistoria(double notaHistoria) {
    this.notaHistoria = notaHistoria;
  }
}
