public class Task09 {
    public static void main(String[] args) {
        System.out.println(compute());
    }

    public static String compute() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return Integer.toString(sum);

    }
}
