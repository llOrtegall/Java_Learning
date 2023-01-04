package org.abtractas.select;

public class Option {
  private String value;
  private String name;
  private boolean selected;

  public Option() {
  }

  public Option(String value, String name) {
    this.value = value;
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getText() {
    return name;
  }

  public void setText(String name) {
    this.name = name;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }
}
