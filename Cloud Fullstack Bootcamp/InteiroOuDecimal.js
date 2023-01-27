// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.


let valor = gets();

//TODO: Descubra se o valor é inteiro ou decimal

if (valor == Math.round(valor)) {

  print("Inteiro")

}else{

  print("Decimal")

}

/* 
Desafio
Faça um Programa que peça ao usuário que insira o valor, em seguida deverá ser mostrado se o número é classificado como INTEIRO ou DECIMAL. 

Entrada 
A entrada consiste em um valor númerico, inteiro ou decimal.

Saída
A saída verá mostrar se o valor é inteiro ou decimal, conforme exemplo abaixo:

Exemplo 1

Entrada	Saída
0,5	Decimal
Exemplo 2

Entrada	Saída
1	Inteiro */