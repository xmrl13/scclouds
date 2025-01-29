package fibonacci;


import java.util.Scanner;

public class FibonacciRecursivoSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a posição para ver seu valor em fibonacci, apenas naturais: ");
        if (scanner.hasNextInt()) {
            int entrada = scanner.nextInt();

            if (entrada >= 0) {
                System.out.println(fibonacciRecursivoSimples(entrada));
            } else {
                System.out.println("Apenas número naturais");
            }
        } else {
            System.out.println("Apenas números naturais");
        }
        scanner.close();
    }

    /*
    * Essa implementação é bastante semelhante a linear em sua essência, mas é uma implementação ruim, da forma como
    * está sendo feito a complexidade de processamento é de O(2^n) pois para levar cada caso aos casos bases
    * o que acontece é que vários casos são calculados varias vezes de forma repetida
    * fib(5) -> fib(4) -> fib(3)
    * fib(4) -> fib(3) -> fib(2)
    * fib(3) -> fib(2) -> fib(1)
    * fib(2) -> fib(1) -> fib(0)
    * fib(1) -> 1
    * Uma possível solução é implementar uma lista que controla os valores já calculados
    * Isso diminui a pilha de chamadas e as computações repetidas.
    * */

    public static int fibonacciRecursivoSimples(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        n = fibonacciRecursivoSimples(n-1) + fibonacciRecursivoSimples(n-2);
        return n;
    }
}