import java.util.*;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number:");
        num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <=num; i++) {
            fact =fact* i;
        }

        System.out.print("Factorial of " + num + " is : " + fact);
        sc.close();

    }
}
