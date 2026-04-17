// Here we Import the Scanner class from Java.
import java.util.Scanner;
public class input {
    public static void main(String[] args){
        //Here we create a scanner object and System.in means the Input is coming from the Terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Input in Java file.");
        // This is the method for taking string Input.
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine(); //Make a variable name and use .nextline for getting input in String
        System.out.printf("Welcome %s, Hope You have a Good Day...!", name);
        System.out.print("\nEnter Your Age: ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.printf("You are Above Age and Your age is %s", age);
        } else {
            System.out.printf("Your age that is %s is Under Age and You are not allowed to be here.", age);
        }
        // If you want to take another string or Int input you have to write another scanner.nextLine() or scanner.nextInt().
        // It cleans the Input Buffer and tells java that we have to take another Input.
        scanner.close(); //Here we have to close the Scanner class to avoid leaking of variables.
    }
}
