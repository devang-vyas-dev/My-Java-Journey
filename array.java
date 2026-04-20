import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[6];
        System.out.println("Enter the Name of Your 5 Loved Ones: ");
        for(int i = 1;i<6;i++){
            System.out.print("Name of the "+ i +" Loved One: ");
            names[i] = scanner.nextLine();
        }
        System.out.println("Enter 1 to check the Names Entered: ");
        System.out.println("Enter 2 to Exit this Program: ");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > 2){
            System.out.println("Kindly, Enter the Number mentioned Before.");
        } else{
            switch (choice) {
                case 1:
                    System.out.println("The Names you Entered are: ");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;
                default:
                    System.out.println("---Thank You---");
                    break;
            }
        }
        scanner.close();
    }
}