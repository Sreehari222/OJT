
class Student {

  private int studentID;
  private String name;
  private int age;
  private double[] grades;

  public Student(int studentID, String name, int age, double[] grades) {
    this.studentID = studentID;
    this.name = name;
    this.age = age;
    this.grades = grades;
  }

  public void updateGrades(double[] newGrades) {
    this.grades = newGrades;
  }

  public void displayStudentInfo() {
    System.out.println("Student ID: " + studentID);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.print("Grades: ");
    for (double grade : grades) {
      System.out.print(grade + " ");
    }
    System.out.println();
  }

  public static void main(String[] args){

    double[] grades = {87.5, 70.0, 68.0};
    Student student = new Student(1, "Harilal C", 26, grades);

    
    student.displayStudentInfo();

    
    double[] newGrades = {90.5, 97.0, 88.0};
    student.updateGrades(newGrades);

    
    student.displayStudentInfo();
}
}