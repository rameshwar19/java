public class RecurFibo {
    static int fibo(int n) {
        if (n == 0) return 0;       
        if (n == 1) return 1;     
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci is " + fibo(n));
    }
}
