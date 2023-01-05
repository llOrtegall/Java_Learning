package org.abtractas.form;

import org.abtractas.ElementoForm;
import org.abtractas.InputForm;
import org.abtractas.SelectForm;
import org.abtractas.TextAreaForm;
import org.abtractas.select.Option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ExampleForm {

  public static void main(String[] args) {
    InputForm username = new InputForm("username");
    InputForm password = new InputForm("password", "password");
    InputForm email = new InputForm("email", "email");
    InputForm age = new InputForm("age", "number");

    TextAreaForm exp = new TextAreaForm("exp", 5, 9);

    SelectForm language = new SelectForm("language");
    Option java = new Option("1", "Java");
    language.addOption(java)
    .addOption(new Option("2", "Python"))
    .addOption(new Option("3", "JavaScript"))
    .addOption(new Option("4", "TypeScript"));

    username.setValue("john.doe");
    password.setValue("123456");
    email.setValue("email@gmail.com");
    age.setValue("25");
    exp.setValue("I'm a Java developer");
    java.setSelected(true);

    List<ElementoForm> elementos = Arrays.asList(username, password, email, age, exp, language);

    for(ElementoForm e : elementos){
      System.out.println(e.drawHtml());
    }

  }
}