// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

const c = parseInt(gets());
var v = new Array(c);

for (let i = 0; i < c; i++){
  v[i] = parseInt(gets());
}

let  primeiroInscrito = true;

const teste  = Number(v.shift());


for( let i = 0; i <= c; i++ ) {
  const bobo  = Number(v[i]);

  if ( teste < bobo ) {
    primeiroInscrito = false;
  }
};

print(primeiroInscrito ? "S" : "N");


/* Desafio
O Império dos Artificialistas é governado por um generoso Monarca. A personalizada do Monarca é conhecida por todo o mundo, principalmente por sua forma como valoriza o bom humor de seu povo, que tem o direito a diversidade cultura. Um dos destaques fica a cargo do bobo da corte, eleito anualmente em um concurso internacional.

O jovem Rafael é um comediante promissor, que sonha em se tornar o bobo da corte nesse grande concurso. Para isso, ele vem se preparando com muita dedicação há vários meses. Chegada a época do concurso do bobo da corte, um total de N candidatos se inscreveram, e como Rafael sabia que ser o primeiro candidato a se inscrever torna-se critério de desempate, foi o primeiro a se inscrever! O concurso dará apenas 5 minutos para cada participante e no final cada cidadão dará seu voto ao futuro bob da corte que achar melhor.

Sendo assim, após a votação, resta apenas apurar os resultados, que será realizado por urna eletrônica com N inteiros, correspondentes ao total de votos em cada candidato, ordenado pela ordem de inscrição. Sua missão é determinar se o jovem Rafael foi eleito ou não.

Entrada
A primeira linha da entrada contém um inteiro N (2 ≤ N ≤ 104). As N linhas seguintes conterão N inteiros positivos v 1 , . . . , vN , um em cada linha, correspondentes ao número de votos recebido por cada um dos candidatos, em ordem de inscrição. Sabendo-se que a população total é de 100.000 pessoas, o número total de votos não será superior a este valor.

Saída
Seu programa produzirá apenas uma linha contendo o caractere ‘S’ se o jovem Rafael foi o eleito para bobo da corte, ou o caractere ‘N’ caso contrário.

 
Exemplos de Entrada	Exemplos de Saída
3
1000
1000
1000

S

5
1
2
3
4
5

N */