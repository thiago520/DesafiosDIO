// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.

let M, S; 

M = parseInt(gets()); 

S = parseInt(gets()); 

//TODO: Retorne o percentual de desconto que foi aplicado no produto

print("O desconto foi de " + (((M-S)/M)*100) + "%")

/* 
Desafio
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 

Entrada
A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor marcado do produto, e na segunda linha o valor do produto com o desconto já aplicado.

Saída
A saída deverá retornar o percentual de desconto que foi aplicado no produto, conforme exemplo abaixo.

Exemplo 1

Entrada	Saída
40
30	O desconto foi de 25%
 

Exemplo 2

Entrada	Saída
500
195	O desconto foi de 61%
 

Exemplo 2

Entrada	Saída
100
50	O desconto foi de 50% */