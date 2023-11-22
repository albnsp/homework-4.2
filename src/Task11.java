public class Task11 {
    public static void main(String[] args) {
        System.out.println("задание 11");
        for (int i = 1; i <= 1000 ; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz " + i);
            }
            if (i % 5 == 0) {
                System.out.println("buzz " + i);
            }
            if (i % 15 == 0) {
                System.out.println("hiss " + i);
            }

        }
    }
}
