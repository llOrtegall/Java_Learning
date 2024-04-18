package Examples;

import Herencia.*;

public class Main {
  public static void main(String[] args) {

    Alumno alumno = new Alumno();
    alumno.setNombres("Juan Sebastian");
    alumno.setApellidos("Gomez Fajardo");
    alumno.setInstitucion("Universidad Nacional");
    alumno.setNotaMatematicas(4.5);
    alumno.setNotaHistoria(3.5);

    AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
    alumnoInternacional.setNombres("Peter");
    alumnoInternacional.setApellidos("Parker");
    alumnoInternacional.setPais("Estados Unidos");
    alumnoInternacional.setInstitucion("Universidad de New York");
    alumnoInternacional.setNotaMatematicas(4.5);
    alumnoInternacional.setNotaIdiomas(4.5);

    Profesor profesor = new Profesor();
    profesor.setNombres("Carlos");
    profesor.setApellidos("Perez");
    profesor.setAsigtura("Matematicas");

    System.out.println("Herencia.Alumno: " + alumno.getNombres() + " " + alumno.getApellidos());
    System.out.println("Herencia.Profesor: " + profesor.getNombres()
            + " " + profesor.getApellidos()
            + " " + profesor.getAsigtura());

    System.out.println("Herencia.AlumnoInternacional: " + alumnoInternacional.getNombres()
            + " " + alumnoInternacional.getApellidos()
            + " " + alumnoInternacional.getPais());
  }
}