
import java.util.Scanner;

public class book {
    String title;
    String author;
    float price;
    int copies;

    void get_details(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title:");
        title = scanner.nextLine();
        System.out.print("Enter book author:");
        author = scanner.nextLine();
        System.out.print("Enter book price:");
        price = scanner.nextFloat();
        System.out.print("Enter number of copies:");
        copies = scanner.nextInt();
        System.out.println();
    }
   void display(){
        System.out.println("Book Title:" + title);
        System.out.println("Book Author:" + author);
        System.out.println("Book Price: $ " + price);
        System.out.println("Number of Copies:" + copies);
        System.out.println();
        System.out.println();

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        book[] arr = new book[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new book();
            System.out.println("Enter details for book " + (i + 1) + ":");
            arr[i].get_details();
        }

        System.out.println("\nBooks In The Inventory:");
        for (book each : arr) {
            each.display();
        }


    }

    }

        






