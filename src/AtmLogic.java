import java.util.HashMap;
import java.util.Map;

public class AtmLogic {

    static HashMap<Integer, Integer> map;

    AtmLogic() {

        map = new HashMap<>();
        map.put(1234, 1000);
        map.put(2345, 1000);
        map.put(3456, 1000);

    }

    public static void withdraw(int pin, int amount) {
        for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
            if (itr.getKey() == pin) {
                if (itr.getValue() > amount) {
                    int remaining = itr.getValue() - amount;
                    itr.setValue(remaining);
                    return;
                } else {
                    System.out.println("Insufficient Balance in your account");
                    return;
                }
            }
        }

        System.out.println("You have entered a wrong pin");

    }

    public static void deposite(int pin, int amount) {
        for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
            if (itr.getKey() == pin) {
                int depo = itr.getValue();
                itr.setValue(depo + amount);
                return;
            }
        }

        System.out.println("You have entered a wrong pin");
    }

    public static void checkBalance(int pin) {
        for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
            if (itr.getKey() == pin) {
                System.out.println("Your balance is " + itr.getValue());
                return;
            }
        }

        System.out.println("You have entered a wrong pin");
    }

    public static void checkPin(int pin) {
        for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
            if (itr.getKey() == pin) {
                System.out.println("You have Entered Correct Pin");
                return;
            }
        }
        System.out.println("You have entered a wrong pin");
        System.exit(0);
    }

}
