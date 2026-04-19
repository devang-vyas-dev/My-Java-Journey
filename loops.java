import java.util.Scanner;
public class loops {
    static char gradeFunction(double avg){
        if (avg>90) return 'A';
        else if (avg>80) return 'B';
        else if (avg>50) return 'C';
        else if (avg>35) return 'D';
        else return 'F';
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome To The Grade's Portal.");
        System.out.print("\nEnter Your Name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s, Kindly Enter the Following Details to proceed.",name);
        System.out.print("\nHow Many Subjects Do you have? (1 to 5): ");
        int numSubject = scanner.nextInt();
        if (1 > numSubject || 5 < numSubject){
            System.out.println("Invalid Number You Must Enter the Number Between 1 and 5.");
            scanner.close();
            return;
        }
        double sum = 0.0;
        for(int i = 1;i<=numSubject;i++){
            System.out.print("Enter the Grade for the Subject Number "+i+ ": ");
            double grade = scanner.nextInt();
            sum += grade;
        }
        double avg = sum / numSubject;
        System.out.println("Average: "+ avg);
        System.out.println("Letter Grade: "+ gradeFunction(avg));
        scanner.close();
    }
}
