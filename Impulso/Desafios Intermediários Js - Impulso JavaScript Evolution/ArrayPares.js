// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar

var array = [ 2, 3, 5, 7, 11, 13, 18, 34 ];

//TODO: Complete os espaços em branco com uma possível solução para o desafio
 
for (let i = 0; i < array.length; i++){
    if (array[i] % 2 == 0){
        print(array[i]);
     }          
}

/* 
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva um programa que retorne como resultado apenas os números pares dessa array, conforme exemplo abaixo.

 

Exemplo 1:

Entrada 

Saída

 2, 3, 5, 7, 11, 13, 18, 34

2
18
34

 */