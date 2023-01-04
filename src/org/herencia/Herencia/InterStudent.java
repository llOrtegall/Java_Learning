package org.herencia.Herencia;

public class InterStudent extends Student {
  private final String country;
  private final double noteEnglish;

  public InterStudent(String names, String lastNames, int age, String email, String School, int Grade, double noteMath,
                      double noteScience, double noteHistory, String Country, double NoteEnglish) {
    super(names, lastNames, age, email, School, Grade, noteMath, noteScience, noteHistory);
    this.country = Country;
    this.noteEnglish = NoteEnglish;
  }

  public String getCountry() {
    return country;
  }

  public double getNoteEnglish() {
    return noteEnglish;
  }

  @Override
  public String greeting() {
    return "Hi, I'm " + getNames() + " " + getLastNames() + ", I am " + getAge() + " years old. I am a student at "
            + getSchool() + " in grade " + getGrade() + ". My grades are: Math: " + getNoteMath() + ", Science: " + getNoteScience()
            + ", History: " + getNoteHistory() + ". I am from " + country + " and my English grade is " + noteEnglish + ".";
  }

  @Override
  public double calAverage() {
    return ((super.calAverage() * 3) + noteEnglish) / 4;
  }

  @Override
  public String toString() {
    return super.toString() + '\n' +
            "country=' " + country + '\'' +
            ", noteEnglish= " + noteEnglish;
  }
}
