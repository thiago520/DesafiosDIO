import java.util.Scanner;

public class AnoBissexto {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  int ano = scanner.nextInt();

  if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
   System.out.println("Bissexto");
  } else {
   System.out.println("Nao Bissexto");
  }
 }
}

/* Para determinar se um ano é bissexto, basta verificar se ele é 
divisível por 400 ou se ele é divisível por 4 e não é divisível por 100. 
Se qualquer uma dessas condições for verdadeira, então o ano é bissexto.*/

/* 
Desafio
Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto

Entrada
A entrada consiste em um valor inteiro referente ao ano solicitado.

Saída
A saída deverá retornar se o ano será bissexto ou não, conforme exemplo abaixo:

Exemplo 1

Entrada	Saída
1992	Bissexto
Exemplo 2

Entrada	Saída
2021	Nao Bissexto */