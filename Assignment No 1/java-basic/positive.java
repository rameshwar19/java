import java.util.*;
public class positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        sc.close();
    }
    
}
