package ProjectNo02;

public class Task3 { /*
    We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
     Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
     Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
     three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
     */
}
interface Marks{
    double getAverage();

}
class A implements Marks{
    double music;
    double science;
    double math;


    A(double music,double science, double math){
        this.music=music;
        this.science=science;
        this.math=math;


    }
    @Override
    public double getAverage() {
        return (music+science+math)/3;
    }
}
class B implements Marks{
    double spanish;
    double PE;
    double history;
    double biology;

    public B(double spanish, double PE, double history, double biology) {
        this.spanish = spanish;
        this.PE = PE;
        this.history = history;
        this.biology = biology;
    }

    @Override
    public double getAverage() {
        return (spanish+PE+history+biology)/4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        System.out.println("Average for student A class is "+new A(90,73,82).getAverage());
        System.out.println("Average for student B class is "+new B(89,75,95,100).getAverage());
    }
}