
import java.util.*;

public class Vendingmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> p = new LinkedHashMap<>();
        p.put(500, 1);
        p.put(200, 0);
        p.put(100, 1);
        p.put(50, 1);
        p.put(20, 1);
        p.put(10, 25);
        p.put(5, 3);
        p.put(1, 500);
        System.out.println(p);

        System.out.println("welcome to the vending machine! ");

        System.out.println("enter you amount: ");

        int a = sc.nextInt();

        System.out.println("enter the price of product: ");

        int b = sc.nextInt();

        System.out.println("processing.....");

        Map<Integer, Integer> res = new HashMap<>();

        if (a - b < 0) {
            System.out.println("payement cant be processed amount should greater than product value");
            return;
        }
        int val = a - b;

        for (Map.Entry<Integer, Integer> entry : p.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            int count = 0;

            
            while (val >= key && value > 0) {
                val = val - key; 
                value--; 
                count++; 
            }

         
            if (count > 0) {
                res.put(key, count);
            }
        }

        System.out.println("your return amount is : ");
        System.out.println(res);

    }
}
