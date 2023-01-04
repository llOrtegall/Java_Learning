package org.abtractas;

import org.abtractas.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

  private List<Option> options;

  public SelectForm(String name) {
    super(name);
    this.options = new ArrayList<Option>();
  }

  public SelectForm(String name, List<Option> options) {
    super(name);
    this.options = options;
  }

  @Override
  public String drawHtml() {
    return "";
  }
}
