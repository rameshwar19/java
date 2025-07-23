import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int search, n;
        System.out.print("Enter Size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("\nEnter Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray Elements :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int l = 0, h = n - 1, m;
        System.out.print("\nEnter Element to Search: ");
        search = sc.nextInt();

        while (l <= h) {
            m = (l + h) / 2;
                if (arr[m] == search) {
                    System.out.println("\nElement " + search + " found at index :" + m);
                    break;
                } else if (search > m) {
                    l = m + 1;
                } else {
                    h = m - 1;
                
            }
        }
        sc.close();
    }
}
