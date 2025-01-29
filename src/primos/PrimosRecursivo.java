package primos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimosRecursivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a posição para ver os primos até N, apenas naturais: ");

        if (scanner.hasNextInt()) {
            int entrada = scanner.nextInt();

            if (entrada >= 1) {
                List<Integer> primos = new ArrayList<>();
                System.out.println(primosRecursivoChamada(entrada, primos));

            } else {
                System.out.println("Apenas número naturais");
            }
        } else {
            System.out.println("Apenas números naturais");
        }
        scanner.close();


    }

    public static List<Integer> primosRecursivoChamada(int n, List<Integer> primos) {

        if (n < 2) {
            return primos;
        }

        List<Integer> resultado = primosRecursivoChamada(n - 1, primos);

        if (isPrimo(n)) {
            resultado.add(n);
        }

        return resultado;
    }

    private static boolean isPrimo(int i) {

        if (i < 2) return false;
        if (i == 2) return true;
        if ((i & 1) == 0) return false;

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