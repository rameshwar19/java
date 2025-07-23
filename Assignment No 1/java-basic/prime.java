import java.util.*;
public class prime {
    public static void main(String[] args) {
        int flag=1;
Scanner sc = new Scanner (System.in);
   System.out.println("enter the no");
   int a= sc.nextInt();
        for (int i = 2; i <a; i++) {
            if(a%i==0){
                flag=0;
                break;
            }

        }
if(flag==1){

 System.out.println("is not prime");   
}
else{
    System.out.println("is prime");
}
sc.close();
    }
}
