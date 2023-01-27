// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.

let vetor = [];
let pares = [];
let impares = [];

//TODO: Implemente uma condição para o armazenamento dos números PARES e ÍMPARES:


//TODO: Imprima os valores dos três vetores um em cada linha:

let v1 = parseInt(gets());

let v2 = parseInt(gets());

let v3 = parseInt(gets());

let v4 = parseInt(gets());

let v5 = parseInt(gets());

vetor.push(v1,v2,v3,v4,v5);

//TODO: Implemente uma condição para o armazenamento dos números PARES e ÍMPARES:

for (var i = 0; i < vetor.length; i++){

   if(vetor[i] % 2 == 0){

       pares.push(vetor[i])

   }else impares.push(vetor[i])

}

//TODO: Imprima os valores dos três vetores um em cada linha:

console.log("Vetor: "+ vetor);

console.log("Par(es): "+ pares);

console.log("Impar(es): "+ impares);

/* Desafio
Faça um Programa que leia cinco números inteiros e armazene-os em um vetor chamado VETOR. Armazene os números pares no vetor PAR e os números ímpares no vetor IMPAR. 

Entrada 
Peça ao usuário que insira o valor de cinco números inteiros. 

Saída
Imprima os valores dos três vetores um em cada linha mostrando na primeira linha, os valores no Vetor, na segunda linha os valores Par(es) e na terceira linha os valores ímpares Impar(es). Conforme o exemplo a baixo.  

 ENTRADA 

SAÍDA 

3

4

6

9

10

Vetor: 3,4,6,9,10
Par(es): 4,6,10
Impar(es): 3,9

4

6

10

20

18

Vetor: 4,6,10,20,18
Par(es): 4,6,10,20,18
Impar(es):
 

3

9

7

11

21


Vetor: 3,9,7,11,21
Par(es):
Impar(es): 3,9,7,11,21

  */