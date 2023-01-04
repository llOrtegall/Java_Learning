package org.ortega.Herencia;

public class Persona {
  protected String names;
  protected String lastNames;
  protected int age;
  protected String email;

  public Persona (String names, String lastNames, int age, String email){
    this.names = names;
    this.lastNames = lastNames;
    this.age = age;
    this.email = email;
  }

  public String getNombres() {
    return names;
  }

  public String getApellidos() {
    return lastNames;
  }

  public String getCorreo() {
    return email;
  }

  public int getEdad() {
    return age;
  }

  public String saludar(){
    return  "Hi, I'm" + names + " " + lastNames + ", I am " + age + " years old.";
  }
}
