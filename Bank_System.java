import java.util.Scanner;
public class Bank_System{
    public static void checkBalance(double balance){
        System.out.println("---Matrix Bank Balance of Account---");
        System.out.printf("\nYour Current Balance is: $%.2f%n",balance);
        System.out.println("------------------------------------");
    }
    public static void depositMoney(double money, double balance){
        double total = balance + money;
        System.out.println("--------------------------------");
        System.out.printf("\nSucess!,After Deposit the Total Balance is: $%.2f%n",total);
        System.out.println("--------Thank You---------------");
    }
    public static void withdrawMoney(double money_w,double balance){
        double after = balance - money_w;
        System.out.println("--------------------------------");
        System.out.printf("\nSucess!,After Withdraw the Total Balance is: $%.2f%n", after);
        System.out.println("--------Thank You---------------");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        double balance = 100000.00;
        System.out.println("--- Bank Management System Menu ---");
        System.out.println("Matrix Bank Me Aapka Swagat Hai.");
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.printf("Welcome Mr.%s, Matrix Bank Aapki Seva me Tatpar Hai.",name);
        while (isRunning){
            System.out.print("\nChoose One of the Options Below to Access The Features.");
            System.out.println("\n1. Check Balance of Your Account.");
            System.out.println("2. Deposit Money In your Account.");
            System.out.println("3. Withdraw Money from Your Account.");
            System.out.println("4. Exit from this Options.");
            System.out.print("Enter Your Choice Number: ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 5){
                System.out.println("Kindly Enter a Valid Choice to Continue.");
            } else{
                switch (choice) {
                    case 1:
                        checkBalance(balance);
                        break;
                    case 2:
                        checkBalance(balance);
                        System.out.print("Enter the Amount You want to Deposit: ");
                        double money = scanner.nextDouble();
                        depositMoney(money,balance);
                        break;
                    case 3:
                        checkBalance(balance);
                        System.out.println("Enter the Amount You want to Withdraw: ");
                        double money_w = scanner.nextDouble();
                        withdrawMoney(money_w, balance);
                        break;
                    default:
                        System.out.println("---Dhanyavaad Aapka Vishwas Hamara Saath---");
                        isRunning = false;
                        break;
                }
            }
        }
    scanner.close();
    }
}