import java.util.*;

public class sum {
    public static void main(String args[]){
        int num,sum=1;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Enter number: ");
        num=sc.nextInt();

        sum=sum+num;

        }while(num!=-1);

        System.out.println("Sum is: "+sum);
        sc.close();

    }
}
