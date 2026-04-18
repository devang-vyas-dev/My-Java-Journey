import java.util.Scanner;
public class conditionals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Now we will check that whether the user can vote or not.
        System.out.println("Welcome to the Voting Age Checker");
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.printf("Welcome Mr.%s,India Conducts the Biggest Elections That Happens in the World",name);
        System.out.print("\nKindly, Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.printf("The System is Processing %s's Age and Result will be Displayed Shortly.",name);
        // The if and else are used to check conditions and to make decisions accordingly.
        if (age>=18){
            System.out.printf("\nThe Candidate Named %s can Vote Because Your Age is Greater than Required.",name);
        } else{
            System.out.printf("The Candidate Named %s will not be able to vote because he is ",18-age," Years old and unable to satisfy the Criteria.");
        }
        System.out.printf("\nThank You for Participating %s and Testing this Code",name);
        scanner.close();
    }
}
