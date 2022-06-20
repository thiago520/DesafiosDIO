for(let cont = 6, n = parseInt(gets().split("\n")); 
cont > 0; (n++ % 2 == 1) ? (console.log(n-1), cont--): n);

/* 
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

 
Exemplo de Entrada	Exemplo de Saída
8

9
11
13
15
17
19


 */