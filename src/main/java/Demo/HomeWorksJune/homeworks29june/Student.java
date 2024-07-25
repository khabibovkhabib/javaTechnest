package Demo.homeworks29june;

public class Student {
    private String name;
    private int studentNumber;
    private double[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    private static int studentCount = 0;

    {
        grades = new double[5];
    }

    public Student() {
        this(null, 0, new double[5]);
    }

    public Student(String name, int studentNumber) {
        this(name, studentNumber, new double[5]);
    }

    public Student(String name, int studentNumber, double[] grades) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grades = grades;
        studentCount++;
    }

    public void printStudentInfo() {
        if (this.name == null) {
            System.out.println("Şagird adı tapılmadı!");
        } else {
            System.out.println("Şagird adı: " + this.name);
        }
        System.out.println("Şagirdin nömrəsi: " + this.studentNumber);
    }

    public static void printStudentCount() {
        System.out.println("Şagird sayı: " + studentCount);
    }

    public void addGrade(double grade) {
        for (int i = 0; i < this.grades.length; i++) {
            if (this.grades[i] == 0) {
                this.grades[i] = grade;
                break;
            }
        }
    }

    public double calculateAverageGrade() {
        double total = 0;
        double count = 0;
        for (int i = 0; i < this.grades.length; i++) {
            if (grades[i] != 0) {
                total = +grades[i];
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

}
