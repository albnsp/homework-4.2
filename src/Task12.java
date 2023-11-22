import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("3адание 12");
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y = ");
        double dist = 0;
        double y = sc.nextDouble();
        int days = 0;
        while (dist < y) {
            dist += x;
            x *= 1.1;
        }
        System.out.println(days+ " - days");
    }
}
