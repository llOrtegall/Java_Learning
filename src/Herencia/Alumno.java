package Herencia;

public class Alumno extends Persona {
  private String institucion;
  private double notaMatematicas;
  private double notaHistoria;

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
