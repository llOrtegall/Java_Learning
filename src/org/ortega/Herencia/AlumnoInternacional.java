package org.ortega.Herencia;

public class AlumnoInternacional extends Alumno{
  private String pais;
  private double notaIdiomas;


  public AlumnoInternacional(String nombres, String apellidos ){
    super(nombres, apellidos);
  }

  public AlumnoInternacional(String nombres, String apellidos, String pais){
    this(nombres, apellidos);
    this.pais = pais;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public double getNotaIdiomas() {
    return notaIdiomas;
  }

  public void setNotaIdiomas(double notaIdiomas) {
    this.notaIdiomas = notaIdiomas;
  }

  @Override
  public String saludar() {
    return "Hola, soy un alumno internacional y mi nombre es " + getNombres() + " " + getApellidos() + " y soy de "
            + pais + ". Tengo " + getEdad() + " años y estudio en " + getInstitucion() + "."
            + " Mis notas son: Matematicas: " + getNotaMatematicas() + ", Ciencias: " + getNotaCiencias() + ", Historia: "
            + getNotaHistoria() + ", Idiomas: " + getNotaIdiomas() + ".";
  }
}
