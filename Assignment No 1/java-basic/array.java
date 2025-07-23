import java.util.*;
public class array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size,sum=0;
        System.out.print("Enter Size Of Array: ");
        size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
         System.out.print("Enter Array Element "+i+" :");
         arr[i]=sc.nextInt();
         sum+=arr[i];
        }
        System.out.print("Addition is: "+sum);
        sc.close();
    }
}
