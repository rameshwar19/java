import java.util.*;
public class loop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size,num,sum=0;
        System.out.print("Enter size:");
        size=sc.nextInt();
        for(int i=1;i<=size;i++){
            System.out.print("Enter Element "+i+ ":");
            num=sc.nextInt();
            sum=sum+num;
        }
        System.out.print("Addition of Numbers is "+sum);
                sc.close();

    }
}
