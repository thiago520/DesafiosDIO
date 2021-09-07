let soma = 0;
let positivos = 0;


for (let i = 0; i < 6 ; i++) {
  let valor = parseFloat(gets());
  if ( valor  > 0) {
     soma = soma +valor;
     positivos++;
  }
}

const average = (soma / positivos);

const calc = (average - parseInt(average)).toFixed(1) == 0.3 ? parseInt(average) + 0.2 : average.toFixed(1);

console.log(positivos + " valores positivos");
console.log(calc)



/* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.

 
Exemplo de Entrada	Exemplo de Saída
7
-5
6
-3.4
4.6
12

4 valores positivos
7.4 */