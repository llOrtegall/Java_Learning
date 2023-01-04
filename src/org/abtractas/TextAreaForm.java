package org.abtractas;

public class TextAreaForm extends ElementoForm {

  private int rows;
  private int cols;

  public TextAreaForm(String name) {
    super(name);
  }

  public TextAreaForm(String name, int rows, int cols) {
    super(name);
    this.rows = rows;
    this.cols = cols;
  }

  public int getRows() { return rows; }

  public void setRows(int rows) { this.rows = rows; }

  public int getCols() { return cols; }

  public void setCols(int cols) { this.cols = cols; }

  @Override
  public String drawHtml() {
    return "<textarea " +
            "name=\" " + this.name + " \" " +
            "rows=\" " + this.rows + " \" " +
            "cols=\" " + this.cols + " \" " +
            ">" + this.value + "</textarea>";
  }
}
