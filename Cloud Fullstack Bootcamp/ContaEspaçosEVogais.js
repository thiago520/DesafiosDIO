// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde:
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - ".split()": esse método transforma uma string em um array de substrings;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.

// TODO: faça um programa que contabilize quantos espaços em branco e quantas vogais existem
//na string de entrada;

let str = gets();

let strSplit = str.toLowerCase().split('');

let whites;
let vogais;

vogais = strSplit.filter(vtVogais);

whites = strSplit.filter(vtWhites);

function vtVogais(str){

 if (str === "a" || str === "e" || str === "i" || str === "o" || str === "u")

 return true;

}

function vtWhites(str){

 if (str === " "){

   return true;

 }

}

console.log("Espacos em branco: " + whites.length + " Vogais: " + vogais.length)

/* 
Desafio
Jorginho é professor do primário de uma determinada escola. Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!

Entrada
A entrada será uma frase no formato de string. 

Saída
A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada string, conforme exemplo abaixo:

 

     EXEMPLO DE ENTRADA 

        EXEMPLO DE SAÍDA 

 “Amo a DIO” 

 Espacos em branco: 2 Vogais: 5 

 “Esse desafio foi facil” 

 Espacos em branco: 3 Vogais: 10 

 “Navegar nas aguas do teu mar” 

 Espacos em branco: 5 Vogais: 11  */