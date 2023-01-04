package org.abtractas;

abstract public class ElementoForm {
  protected  String value;
  protected String name;

  public ElementoForm() {}

  public ElementoForm(String name) {
    this();
    this.name = name;
  }

  public void setValue(String value) {
    this.value = value;
  }

  abstract public String drawHtml();
}
