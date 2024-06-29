package Demo.homeworks29june;

public class Student {
    String name;
    int studentNumber;
    double[] grades;
    static int studentCount = 0;
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
    public void addGrade(double grade){
        for (int i=0;i<this.grades.length;i++){
            if (this.grades[i]==0){
                this.grades[i]=grade;
                break;
            }
        }
    }
    public double calculateAverageGrade (){
        double total=0;
        double count=0;
        for (int i=0;i<this.grades.length;i++){
            if (grades[i]!=0){
                total=+grades[i];
                count++;
            }
        }
        return count>0?total/count:0;
    }

    public static void main(String[] args) {
        Student student1= new Student();
        student1.printStudentInfo();
        student1.addGrade(85.2);
        student1.addGrade(71.2);
        System.out.println("Ortalama bal: "+ student1.calculateAverageGrade());

        Student student2= new Student("Habib",1234);
        student2.printStudentInfo();
        student2.addGrade(100.00);
        student2.addGrade(99.00);
        student2.addGrade(97.00);
        System.out.println("Ortalama bal: "+student2.calculateAverageGrade());

        Student student3= new Student("Yusif",2345,new double[]{90,88,69,99,89});
        student3.printStudentInfo();
        System.out.println("Ortalama bal: "+student3.calculateAverageGrade());
    }
}
