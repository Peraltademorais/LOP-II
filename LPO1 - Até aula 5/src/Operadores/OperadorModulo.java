package Operadores;

import java.util.Scanner;

public class OperadorModulo {
	public static void main (String args[]) {
		int num1, divi;
		Scanner input= new Scanner(System.in);
		System.out.print("Digite um valor:");
		num1= input.nextInt();
		divi= num1 % 3;
		if (divi == 0) {
			System.out.printf("O valor � multiplo de 3");
		}
		else {
			System.out.printf("O valor n�o � multiplo de 3");
		}
		
	}
}
