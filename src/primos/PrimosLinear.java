package primos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimosLinear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a posição para ver os primos até N, apenas naturais: ");

        if (scanner.hasNextInt()) {
            int entrada = scanner.nextInt();

            if (entrada >= 1) {
                System.out.println(primosLinear(entrada));

            } else {
                System.out.println("Apenas número naturais");
            }
        } else {
            System.out.println("Apenas números naturais");
        }
        scanner.close();


    }

    public static List<Integer> primosLinear(int n) {

        List<Integer> primos = new ArrayList<>();

        if (n < 2) return primos;

        primos.add(2); //Unico par primo

        for (int i = 3; i <= n; i += 2) {
            if (isPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    private static boolean isPrimo(int i) {

        // arredondando para inteiro a raiz de i
        // int raiz de i * 2 == i ( recebido pelo metodo) então o numero tem raiz exata
        // Se tem raiz exata não é primo
        // Essa otimização evita varias iterações do loop da sequencia
        int raiz = (int) Math.sqrt(i);
        if (raiz * raiz == i) return false;

        for (int j = 3; j <= raiz; j += 2) { // J deve ser menor que raiz de i.
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}