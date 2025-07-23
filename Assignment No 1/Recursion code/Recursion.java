public class Recursion {
  
    static int factorial(int n){
        int fact=1;
     for(int i=1;i<=n;i++){
       fact=fact*i;
     }
     return fact;
    }

    public static void main(String[] args) {
    int x=5;
    System.out.println("factorial is "+factorial(x));
    }
}