package fibonacci;


import java.util.Scanner;

public class FibonacciRecursivoMelhorado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a posição para ver seu valor em fibonacci, apenas naturais: ");
        if (scanner.hasNextInt()) {
            int entrada = scanner.nextInt();

            if (entrada >= 0) {
                int[] memoria = new int[entrada + 1];//Essa lista vai armazenar os valores já calculados e evitar recomputação;
                System.out.println(fibonacciRecursivoMelhorado(entrada, memoria));
            } else {
                System.out.println("Apenas número naturais");
            }
        } else {
            System.out.println("Apenas números naturais");
        }
        scanner.close();
    }

    public static int fibonacciRecursivoMelhorado(int n, int[] memoria) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        //Aqui verificamos se o valor para a chamada N já está dentro da lista
        //Caso esteja nós utilizamos ele invés de recalcular
        if (memoria[n] != 0) {
            return memoria[n];
        }

        memoria[n] = fibonacciRecursivoMelhorado(n - 1, memoria) + fibonacciRecursivoMelhorado(n - 2, memoria);
        return memoria[n];
    }
}