import java.util.*;

class car {
    String color;
    int speed;

    void drive() {
        System.out.print("The Speed of Ram's Car is : " + speed);
    }
}

public class mycar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car car = new car();
        System.out.print("Enter car Color: ");
        car.color = sc.next();

        System.out.print("Enter car speed : ");
        car.speed = sc.nextInt();
        car.drive();
        sc.close();
    }
}
