// a função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar

let T = parseInt(gets());
let N;

//TODO: Complete os espaços em branco com uma possível solução para o desafio
        while (T !==  0) {
            for (let i = 1; i <= T; i++) {
                N = parseInt(gets());
                if (N % 2 !== 0)
                 print( (N -1)* 2 + 1);
                else 
                print((N - 2) * 2 + 2);
            }
            T = parseInt(gets());
        }


/* 
        Desafio
        O Réveillon é uma das festas mais esperadas do hotel Copacabana Palace. Mesmo sendo restrito para um seleto grupo de pessoas, o salão fica abarrotado de gente e muitas vezes os garçons não dão conta de atender a todos da mesma maneira. 
        
        Os convidados que sentam nas pontas das mesas são os privilegiados, pois são atendidos com somente um pedido, mas os demais precisam sempre pedir duas vezes, pois os garçons não conseguem dar a mesma atenção a eles. Além disso, há uma superstição de entrada de ano que diz que, se não houver um número par de pessoas que não sentam nas pontas, o próximo ano será um desastre.
        
        Portanto, sua tarefa é determinar a soma da quantidade de pedidos de cada um para saber se vale a pena ir ao Réveillon de Copacabana ou se é melhor ficar em casa e assistir ao Show da Virada.
        
        Entrada
        A entrada é composta por T (1 ≤ T ≤ 100) indicando a quantidade de casos de teste e então, T inteiros N (3 ≤ N ≤ 104), indicando a quantidade de pessoas. A mesa é retangular e haverá pelo menos e no máximo uma pessoa em uma das pontas, isto é, se uma ponta estiver vazia, a outra deve ser ocupada, ou senão, as duas pontas estarão ocupadas, mas o número de pessoas que não estão nas pontas sempre será par. O final da entrada é indicado por T = 0.
        
        Saída
        Seu programa deverá imprimir a soma da quantidade de pedidos de cada pessoa. Não haverá linha em branco entre os casos de teste.
        
         
        Exemplo de Entrada	Exemplo de Saída
        5
        
        13
        
        37
        
        49
        
        11
        
        9
        
        2
        
        5
        
        17
        
        0
        
        25
        
        73
        
        97
        
        21
        
        17
        
        9
        
        33 */       