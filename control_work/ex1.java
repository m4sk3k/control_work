import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " - больше 10 и меньше 20 включительно?");
        if (proverka(a, b) == true) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    static boolean proverka(int a, int b) {
        if ((a + b <= 20) && (a + b >= 10)) {
            return true;
        } else {
            return false;
        }
    }
}