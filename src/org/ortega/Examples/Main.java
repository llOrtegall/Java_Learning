package org.ortega.Examples;

import org.ortega.Herencia.*;

public class Main {

  public static void main(String[] args) {
    Person person_01 = new Person("Ivan Marino", "Ortega Garzon", 27, "email@gmail.com.co");

    Person person_02 = new Person("Andrea", "Tafur", 17, "andre@gmail.com");

    Student student_01 = new Student("Ivan Marino", "Ortega Garzon", 27, "email2@gmail.com",
            "123456789", 8, 4.5, 3.8, 4.0);

    Student student_02 = new Student("Andrea", "Tafur", 17, "email4@gmail.com",
            "Int. Federal", 9, 4.5, 4.0, 4.0);

    Teacher teacher_01 = new Teacher("Ivan Marino", "Ortega Garzon", 27, "email3@gmail.com",
            "123456789", "Ingenieria de Sistemas");

    PrintPerson(person_01);
    PrintPerson(person_02);
    PrintPerson(student_01);
    PrintPerson(student_02);
    PrintPerson(teacher_01);
  }

  public static void PrintPerson(Person p){
    System.out.println(
            "Names: " + p.getNames() + '\n' +
            "LastNames: " + p.getLastNames() + '\n' +
            "Age: " + p.getAge() + '\n' +
            "Email: " + p.getEmail());

    System.out.println(" <------ greeting " + p.getNames() + " -----> ");

    System.out.println( p.greeting() );

    System.out.println("<---------------- new Person ---------------->");
  }

}