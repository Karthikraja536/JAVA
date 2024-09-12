import java.util.Scanner;

class Student {
    String name;
    float hgrade;
    float fegrade;

    public Student(String name,float hgrade ,float fegrade) {
        this.name = name;
        this.hgrade = hgrade;
        this.fegrade = fegrade;


    }
    double avg(){
        return (hgrade + fegrade)/2;

    }
}
public class Grade_Manager{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name:");
        String name = scanner.nextLine();

        System.out.print("Enter the homework grade:");
        float hgrade = scanner.nextFloat();

        System.out.print("Enter the final exam grade:");
        float fegrade = scanner.nextFloat();


        Student obj = new Student(name, hgrade,fegrade);
        System.out.println("Student Name:" + obj.name);
        System.out.println("Average of:" +  " " + obj.name + " " + "is" + " " + obj.avg());


    }
}