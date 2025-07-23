
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumodd = 0, sumeven = 0;
        System.out.println("Enter Size");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                sumeven += i;
            } else {
                sumodd += i;
            }

        }
        System.out.println("Sum of Even: " + sumeven);
        System.out.println("Sum of odd: " + sumodd);

        sc.close();

    }

}
