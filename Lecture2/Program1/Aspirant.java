package Lecture2.Program1;

public class Aspirant extends Student{
    String sci_work="JAVA Language";
    public Aspirant(String firstName, String lastName, String group, double averageMArk, String sci_work) {
        super(firstName, lastName, group, averageMArk);
        this.sci_work = sci_work;
    }
    Aspirant(){
        super();
    }

    public int getScholarship(){
        int sum=0;
        if (averageMark==5){
            sum =200;
        } else{
            sum = 180;
        }
        return sum;
    }
}