import java.util.*;
public class fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        int next = 0;
        System.out.println("Enter Number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
        System.out.println(a);
         next=a+b;
         a=b;
         b=next;

        }
        sc.close();
    }
    
}
