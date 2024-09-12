import java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner bio = new Scanner(System.in);

        System.out.print("enter the name:");
        String name = bio.nextLine();

        System.out.print("enter the initial");
        char initial = bio.next().charAt(0);

        System.out.print("enter the age:");
        int age = bio.nextInt();

        System.out.print("enter the height:");
        float height = bio.nextFloat();

        System.out.print("enter the ph no:");
        long ph_no = bio.nextLong();



        System.out.println("name:" + name);
        System.out.println("Initial:" + initial);
        System.out.println("age:" + age);
        System.out.println("height:" + height);
        System.out.println("phone no:" + ph_no);
    }
}
