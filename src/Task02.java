import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("задание 2");
/*
          for ( int j = 0; j < 10; j++){ // главная часть она задает цикл J<3

            for ( int i =1; i <= 10; i++){ // цикл что будет выводиться
                System.out.print (i * j + "\t"); // надо чтобы был именно принТ
            }
            System.out.println(" \tJ -" + j); // чтобы появились строчки колоночки
        }

 */
        System.out.println("введите положительное число: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean b = true;

        for (int p = 0; p<= input; p++){
            for (int i = 2; i< p; i++) {
                if (p % i == 0) {
                    b = false;
                    break;
                }
            }
            if ( b ) System.out.println(p);
            else b = true;
        }

        }
    }

