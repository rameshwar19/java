package Array;


import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array Element:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        } 
        System.out.println("Array Elements:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }


          System.out.print("Enter element to update:");
          int num=sc.nextInt();
          System.out.print("Enter new number:");
          int newnum=sc.nextInt();

        for (int i = 0; i < n; i++) {
           if(arr[i]==num){
            arr[i]=newnum;
           }

        }
        System.out.println("Array Elements after updation:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"\n");

        }

        sc.close();
    }

}
