import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int count = 0;

        if (n == 0) {
            System.out.println(1);
            return;
        }

        while (n > 0) {
            count++;
            n /= 10;
        }

        System.out.println(count);
    }
}