import java.util.Scanner;

public class App extends AtmLogic {

    public static void main(String[] args) {
        System.out.println("Welcome To AAA Bank");
        Scanner sc = new Scanner(System.in);
        AtmLogic atm = new AtmLogic();
        System.out.println("Enter the pin");
        int pin = sc.nextInt();
        AtmLogic.checkPin(pin);

        System.out.println("************************************");

        System.out.println("1. Withdraw");
        System.out.println("2. Deposite");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        while (true) {
            System.out.println("Enter the option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount");
                    int amount = sc.nextInt();
                    AtmLogic.withdraw(pin, amount);
                    break;

                case 2:
                    System.out.println("Enter the amount");
                    int amount1 = sc.nextInt();
                    AtmLogic.deposite(pin, amount1);
                    break;

                case 3:
                    AtmLogic.checkBalance(pin);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}
