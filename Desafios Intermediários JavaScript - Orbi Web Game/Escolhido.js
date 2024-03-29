let qtd = gets();
let arrMatricula = []
let arrNota = []

if(qtd >= 3 && qtd <= 100){
  for(var i=0; i<qtd; i++){
    let linha = gets().split(' ');
    arrMatricula[i] = parseInt(linha[0]);
    arrNota[i] = parseFloat(linha[1]);
  }
}
var max = arrNota.reduce(function(a, b) {
  return Math.max(a, b)
})
for(i=0; i<qtd; i++){ 
  if(max < 8){
    console.log("Minimum note not reached")
    break;
  } else if (arrNota[i] === max) {
    console.log(arrMatricula[i])
 }
}

/* Desafio
As aulas do Prof. Xavier estão dando o que falar até no exterior, pois ele ensina Algorítmos de um jeito diferente aos seus alunos. Uma universidade dos EUA, que soube sobre o método do Prof. Xavier, quer selecionar um aluno para um intercâmbio no país. Para isso, ele possuem uma lista de inscrição com o número de cada aluno e sua nota. 

Para ajudá-los a encontrarem o melhor aluno que ganhará o intercâmbio, você deve desenvolver um programa. Só tem um detalhe, se a nota mais alta não for maior ou igual a 8, você deverá imprimir “Minimum note not reached”.

Entrada
O arquivo contém primeiro a quantidade de alunos (3 <= n <= 100) existentes e em seguida, os n alunos contendo o número da matrícula (0 < m < 1000000) de cada um, seguido da respectiva nota (0 <= nota <= 10.0, com 1 casa decimal).

Obs.: as notas não serão repetidas. Ou seja, não tem chance de ter dois alunos com a mesma nota.

Saída
Você deve imprimir o número do estudante que obteve a maior pontuação ou "Minimum note not reached" (sem aspas) caso nenhum estudante tenha tirado uma nota maior ou igual a 8.

 
Exemplo de Entrada	Exemplo de Saída
3
1000 5
1001 10
1002 6

1001

4
900775 5.7
201553 7.9
5032 6.2
2088 2.1

Minimum note not reached

  */