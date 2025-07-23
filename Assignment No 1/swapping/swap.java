package swapping;

import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("enter first value");
        int a = sc.nextInt();
        System.out.println("enter second value");
        int b = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("A is:" + a + "\nB is:" + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("A is:" + a + "\nB is:" + b);
        sc.close();
    }
}
