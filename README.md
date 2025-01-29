Fibonacci
Já conhecia o desafio de implementar a sequência de Fibonacci para um número N. Esse estudo está disponível no meu GitHub, no projeto Estrutura de Dados.

Assim como no projeto de Estrutura de Dados, fiz três implementações: a implementação linear, que é a melhor das três; uma implementação recursiva trivial, que é ineficiente; e uma implementação recursiva aprimorada, que é boa, mas ainda não é tão eficiente quanto a implementação linear em termos de memória e processamento.

A recursividade é muito útil quando não conhecemos o limite daquilo que estamos explorando, como, por exemplo, na implementação de algoritmos de ordenação em árvores.

Primos
Esse desafio é interessante por vários motivos, e algumas propriedades são fundamentais para resolvê-lo de maneira eficiente. Já tinha o conhecimento prévio de que números primos não possuem raiz exata, o que faz com que diversos números não precisem ser testados em loop para verificar se são primos. Além disso, é possível descartar todos os pares maiores que 2.

Uma coisa interessante que descobri posteriormente é que existe uma técnica chamada Crivo de Eratóstenes, que otimiza significativamente o processamento, sendo muito melhor do que a abordagem que eu implementei.

A abordagem que implementei inicialmente consiste em verificar a raiz do número e testar, para cada inteiro menor ou igual à raiz, se ele é um divisor de N. Caso seja, então N pode ser escrito como N = a × b, onde N é o número candidato, a é um natural maior que 1 e b é um natural maior que n.

Um exemplo simples de demonstração é o número 37, cuja raiz quadrada é aproximadamente 6,09. Logo, iteramos todos os ímpares entre 3 e 6, testando se são divisores de 37. Isso resulta em apenas duas iterações do loop de verificação, graças à otimização de testar os divisores apenas até a raiz do número.

O Crivo de Eratóstenes funciona de forma diferente: para um N, ele cria uma lista de 0 até N e itera sobre ela, removendo os números que podem ser expressos como o produto de dois outros números. Por exemplo: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]. O algoritmo começa pelo 2, removendo todos os números que são divisíveis por ele, já que um número primo tem apenas dois divisores: 1 e ele mesmo.

Então, a lista fica assim: [0, 1, 2, 3, 5, 7, 9, 11, 13, 15, 17, 19]. Todos os pares foram removidos, e uma possível otimização é nem mesmo inseri-los durante a construção da lista.

O próximo passo é fazer a mesma verificação para o número seguinte, que certamente não será múltiplo de 2 e, nesse caso, é garantido que seja primo. Assim, a lista fica da seguinte forma: [0, 1, 2, 3, 5, 7, 11, 13, 17]. Para o número 5, a lista permanece a mesma: [0, 1, 2, 3, 5, 7, 11, 13, 17].
