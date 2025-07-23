
public class recr {
    static int fabo(int n){
        int a=0,b=1,next;
        for(int i=2;i<=n;i++)
        {
            next=a+b;
            a=b;
            b=next;
        }
        return (n==0)?0:b;
    }
    public static void main(String[] args){
        int n=10;
        System.out.println("Fabonacci is "+fabo(n));
    }
}
