package Lecture2.Program1;

public class Main {
    public static void main(String[] args) {
        Student []students = new Student[4];
        students[0]= new Student();
        students[1] = new Aspirant();
        students[2] = new Student("Denis","Lugovenko","BUT", 5);
        students[3] = new Aspirant("Maksim","Barsov","BAP", 3, "Python Language");
        for(int i=0;i< students.length;i++){
            System.out.println(students[i].lastName + " " + students[i].getScholarship());
        }
    }
}
