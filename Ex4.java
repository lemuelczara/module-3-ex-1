import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);

        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> arrNumeros = new ArrayList<Integer>();

        System.out.println("Informe um número: ");
        int m = scan.nextInt();

        for (int i = 1; i <= m; i++) {
            if (isPrime(i)) {
                arrNumeros.add(i);
            }
        }

        arrNumeros.stream().forEach(n -> System.out.println(n));

        scan.close();
    }
}
