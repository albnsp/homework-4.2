public class Task06 {
    static int COUNT = 0;

    public static void main(String[] args) {
        System.out.println("задание 6");
        for (int i = 10_000_000; i <= 99_999_999; i++) {
            if (hasUniqueDigits(i) && i % 12345 == 0) {
                System.out.println(i);
                COUNT ++;
            }
        }
        System.out.println("общее кол-во: " + COUNT);
    }

    private static boolean hasUniqueDigits(int number) {
        boolean[] chislos = new boolean[10];

        while (number > 0) {
            int chislo = number % 10;
            if (chislos[chislo]) {
                return false;
            }
            chislos[chislo] = true;
            number = number / 10;
        }
        return true;
    }
}
