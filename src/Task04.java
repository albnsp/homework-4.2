public class Task04 {
    public static void main(String[] args) {
        System.out.println("задание 4");
        System.out.println("Cщвершенные числаот 0 до 1_000_000");
        for (int i = 0; i <= 1_000_000; i++) {
            if (isPerfectNumber(i)) {
            System.out.println(i);
        }
    }
}

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for ( int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }
}
