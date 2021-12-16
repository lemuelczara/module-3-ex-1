import java.util.Scanner;

/**
 * Desenvolver um programa para exibição por console os n primeiros números
 * naturais que
 * têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai
 * informar pelo
 * console.
 * Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve
 * exibir os primeiros 5
 * números naturais que tenham pelo menos 2 dígitos terminados em 3 no console.
 * Neste
 * caso, a saída será: 33, 133 , 233, 303, 313.
 * Dependendo de como você decidir abordar a solução para este exercício, pode
 * ser
 * necessário usar recursos que ainda não estudamos. Faz parte do desafio
 * encontrar
 * soluções na Internet e utilizá-las.
 */

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumsInteiros = 0;
        int num = 0;

        System.out.print("Informe o 1º número: ");
        int n = scan.nextInt();

        System.out.print("Informe o 2º número: ");
        int m = scan.nextInt();

        System.out.print("Informe o 3º número: ");
        int d = scan.nextInt();

        while (qtdNumsInteiros <= n) {
            num++;

            String numString = String.valueOf(num);

            int totalNumerosString = 0;

            for (int i = 0; i < numString.length(); i++) {
                if (Character.toString(numString.charAt(i)).equals(String.valueOf(d))) {
                    totalNumerosString++;
                }

                if (totalNumerosString == m) {
                    System.out.println(numString);

                    qtdNumsInteiros++;

                    break;
                }
            }
        }
    }
}
