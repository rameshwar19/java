package swapping;

import java.util.*;

public class swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter first value");
        int a = sc.nextInt();
        System.out.println("enter second value");
        int b = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("A is:" + a + "\nB is:" + b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping");
        System.out.println("A is:" + a + "\nB is:" + b);
        sc.close();
    }
}
