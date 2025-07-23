import java.util.*;

public class fabo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int next;
        for (int i = 2; i <= n; i++) {

            next = a + b;
            System.out.println(a);

            a = b;
            b = next;

        }

        sc.close();

    }
}
