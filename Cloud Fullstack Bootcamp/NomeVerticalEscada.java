// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,  
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".  
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class NomeVerticalEscada {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  String nome = scanner.nextLine();

  for (int i = 1; i <= nome.length(); i++) {
   System.out.println(nome.substring(0, i));
  }
 }
}

/* Descrição
Faça um programa que solicite o nome do usuário e imprima-o de forma a mostrar o nome em formato de escada.
 

Entrada
A entrada consiste em uma string, sendo ela uma palavra.

Saída
A saída deverá imprimir a palavra em formato de escada, letra por letra, até se completar a palavra, conforme exemplo abaixo.

 

Exemplo 1

Entrada	Saída
FULANO	F
FU
FUL
FULA
FULAN
FULANO
Exemplo 2

Entrada	Saída
MARIA	
M

MA

MAR

MARI

MARIA */