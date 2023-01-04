package org.herencia.Herencia;

public class Teacher extends Person {
  private final String asignature;
  private final String carrer;

  public Teacher(String names, String lastNames, int age, String email, String asignature, String carrer) {
    super(names, lastNames, age, email);
    this.asignature = asignature;
    this.carrer = carrer;
  }

  public String getAsignature() {    return asignature;  }

  public String getCarrer() {    return carrer;  }

  public String greeting() {
    return "Hi, I'm " + getNames() + " " + getLastNames() + ", I am " + getAge() + " years old. I am a "
            + carrer + " teacher and I teach " + asignature + ".";
  }
}
