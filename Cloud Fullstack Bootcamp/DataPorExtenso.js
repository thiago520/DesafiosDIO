let data = gets();

let dataSplit = data.split('/');

let mesExtenso = ''



switch (parseInt(dataSplit[1])) {

    case 01:

        mesExtenso = 'Janeiro'

        break;

    case 02:

        mesExtenso = 'Fevereiro'

        break;

    case 03:

        mesExtenso = 'Marco'

        break;

    case 04:

        mesExtenso = 'Abril'

        break;

    case 05:

        mesExtenso = 'Maio'

        break;

    case 06:

        mesExtenso = 'Junho'

        break;

    case 07:

        mesExtenso = 'Julho'

        break;

    case 08:

        mesExtenso = 'Agosto'

        break;

    case 09:

        mesExtenso = 'Setembro'

        break;

    case 10:

        mesExtenso = 'Outubro'

        break;

    case 11:

        mesExtenso = 'Novembro'

        break;

    case 12:

        mesExtenso = 'Dezembro'

        break;



}



print(dataSplit[0] + ' de ' + mesExtenso + ' de ' + dataSplit[2])

/* 
Desafio
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

Entrada
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

Saida
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.

 

  EXEMPLO DE ENTRADA 

  EXEMPLO DE SAÍDA 

  19/10/1997 

  19 de Outubro de 1997 

  25/12/2019 

  25 de Dezembro de 2019 

  02/02/2020 

  02 de Fevereiro de 2020  */