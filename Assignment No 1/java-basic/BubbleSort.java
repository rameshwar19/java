import java.util.*;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size,temp;
        System.out.print("Enter Size Of Array: ");
        size=sc.nextInt();
        int[] arr=new int[size];

        System.out.print("\nEnter Array Element : ");
        for(int i=0;i<size;i++){
         arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
         System.out.println("\nSorted Array:");
        for(int i=0;i<size;i++){
         System.out.print(arr[i] + " ");
        }


        sc.close();

    }
}
