import java.util.Scanner;

public class Ex3 {
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

        System.out.println("Informe um número: ");
        int num = scan.nextInt();

        System.out.println(isPrime(num) ? "É primo" : "Não é primo");

        scan.close();
    }
}
