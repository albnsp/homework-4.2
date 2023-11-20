import java.util.Scanner;

public class Task05 {
        public static boolean isPalindrome(int number) {
            int originalNumber = number; // 111
            int reversedNumber = 0; // 0

            while (number != 0) { // 111 != 0
                int digit = number % 10; // 11
                reversedNumber = reversedNumber * 10 + digit; // 11
                //             =       0        * 10 + 11
                number = number / 10; // 1
            }
            return originalNumber == reversedNumber; // 32123 == 32123
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
