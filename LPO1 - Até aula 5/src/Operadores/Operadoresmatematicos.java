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
		System.out.println("Opera��o de soma :" + soma);
		System.out.println("Opera��o de subtra��o :" + sub);
		System.out.println("Opera��o de multiplica��o :" + multi);
		System.out.println("Opera��o de divis�o :" + divi);
	}//fim main
}//fim classe
