package fibonacci;

import java.util.Scanner;

public class FibonacciLinear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a posição para ver seu valor em fibonacci, apenas naturais: ");
        if (scanner.hasNextInt()) {
            int entrada = scanner.nextInt();

            if (entrada >= 0) {
                fibonaciLinear(entrada);
            } else {
                System.out.println("Apenas número naturais");
            }
        } else {
            System.out.println("Apenas números naturais");
        }
        scanner.close();
    }

    public static void fibonaciLinear(int n) {

        /*
       Fibonacci linear
       N >= 0 (deve validar o input para a função), e retornar o valor correspondente
       Desse número na sequência Fibonacci.
       Fn = Fn-1 + Fn-2
       fib(0) =0 Caso base 1
       fib(1) = 1 Caso base 2
       fib(2) = fib(1) + fib(0)
       fib(3) = fib(2){fib(1) + fib(0)} + fib(1)
       Já havia estudado a sequência de fibonacci e em minha opinião essa é a melhor implementação
       Em relação a implementação recursiva, pois a recursividade empilha chamadas na pilha e pode ser ruim
       Além de que, a implementação recursiva é mais complexa pois para que seja evitado retrabalho até os casos base
       Existem alguns detalhes técnicos, na implementação linear o processamento é O(N) ou seja, linear
       Cada calculo é feito apenas uma vez.
        * */

        if (n < 0) {
            System.out.println("N deve ser maior ou igual a 0");
            return;
        } else if (n == 0) {
            System.out.println("0");
            return;
        } else if (n == 1) {
            System.out.println("1");
            return;
        }

        int casoBase1 = 0; // pois f(0) = 0, por definição.
        int casoBase2 = 1; // pois f(1) = 1, por definição.
        int casoAtual = 0; // caso atual recebera o valor dos casos anteriores até as interações de n se igualarem a i

        for (int i = 2; i <= n; i++) {
            casoAtual = casoBase1 + casoBase2;
            casoBase1 = casoBase2;
            casoBase2 = casoAtual;
        }

        System.out.printf("Para %d o valor é: %d%n", n, casoAtual);
    }
}
