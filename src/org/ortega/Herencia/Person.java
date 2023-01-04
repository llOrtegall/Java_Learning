package org.ortega.Herencia;

public class Person {
  private final String names;
  private final String lastNames;
  private final int age;
  private final String email;

  public Person (String names, String lastNames, int age, String email){
    this.names = names;
    this.lastNames = lastNames;
    this.age = age;
    this.email = email;
  }

  public String getNames() { return names; }

  public String getLastNames() {return lastNames; }

  public String getEmail() { return email; }

  public int getAge() { return age; }

  public String greeting(){
    return  "Hi, I'm " + names + " " + lastNames + ", I am " + age + " years old.";
  }

  @Override
  public String toString() {
    return  "names=' " + names + '\'' +
            ", lastNames=' " + lastNames + '\'' +
            ", age= " + age +
            ", email=' " + email + '\'';
  }
}
