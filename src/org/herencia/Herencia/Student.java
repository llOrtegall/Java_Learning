package org.herencia.Herencia;

public class Student extends Person {
  private final String school;
  private final int grade;
  private final double noteMath;
  private final double noteScience;
  private final double noteHistory;

  public Student(String names, String lastNames, int age, String email, String School, int Grade,
      double noteMath, double noteScience, double noteHistory){
    super(names, lastNames, age, email);
    this.school = School;
    this.grade = Grade;
    this.noteMath = noteMath;
    this.noteScience = noteScience;
    this.noteHistory = noteHistory;
  }

  public String getSchool() { return school; }

  public int getGrade() { return grade; }

  public double getNoteHistory() { return noteHistory; }

  public double getNoteScience() { return noteScience; }

  public double getNoteMath() { return noteMath; }

  @Override
  public String greeting() {
    return "Hi, I'm " + getNames() + " " + getLastNames() + ", I am " + getAge() + " years old. I am a student at "
            + school + " in grade " + grade + ". My grades are: Math: " + noteMath + ", Science: " + noteScience
            + ", History: " + noteHistory + ".";
  }

  public double calAverage(){
    return (noteMath + noteScience + noteHistory) / 3;
  }

  @Override
  public String toString() {
    return super.toString() +
            "school=' " + school + '\'' +
            ", grade= " + grade +
            ", noteMath= " + noteMath +
            ", noteScience= " + noteScience +
            ", noteHistory= " + noteHistory +
            ", average: " + calAverage() + '\n';
  }
}
