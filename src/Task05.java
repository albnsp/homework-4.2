import java.util.Scanner;

public class Task05 {
        public static boolean isPalindrome(int number) {
            int originalnumber = number;
            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return originalnumber == reversedNumber;
        }

        public static void main(String[] args) {
            System.out.println("задание 5");
            Scanner sc = new Scanner(System.in);
            System.out.println("ввудите число: ");
            int number = sc.nextInt();
            if (isPalindrome(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
