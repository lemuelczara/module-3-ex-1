import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumPares = 0;
        int i = 0;

        System.out.print("Informe um número: ");
        int n = scan.nextInt();

        while (qtdNumPares <= n) {
            if (i % 2 == 0) {
                System.out.println(i);

                qtdNumPares++;
            }

            i++;
        }

        scan.close();
    }
}
