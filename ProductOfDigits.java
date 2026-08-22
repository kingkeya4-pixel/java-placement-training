import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int product = 1;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }

        System.out.println(product);
    }
}