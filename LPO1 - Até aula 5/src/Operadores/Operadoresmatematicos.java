package Operadores;

import java.util.Scanner;

public class Operadoresmatematicos {
	
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		int a, b, soma, sub, multi, divi; 
		System.out.print("Digite o valor de a:");
		a= input.nextInt();
		System.out.print("Digite o valor de b:");
		b= input.nextInt();
		soma= a + b;
		multi= a * b;
		sub= a-b;
		divi= a/b;
		System.out.println("Operação de soma :" + soma);
		System.out.println("Operação de subtração :" + sub);
		System.out.println("Operação de multiplicação :" + multi);
		System.out.println("Operação de divisão :" + divi);
	}//fim main
}//fim classe
