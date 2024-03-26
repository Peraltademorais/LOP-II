package Operadores;

import java.util.Scanner;
public class OperadoresRelacionais {
	public static void main(String args[]) {
		int num1,num2;
		Scanner input= new Scanner(System.in);
		System.out.print("Digite o valor de num1:");
		num1= input.nextInt();
		System.out.print("Digite o valor de num2:");
		num2= input.nextInt();
		if(num1 != num2) {
			System.out.printf("%d != %d \n", num1, num2);
			
		}//fim if
		if(num1 == num2) {
			System.out.printf("%d == %d \n", num1,num2);
		}
		if(num1 == num2) {
			System.out.printf("%d == %d \n", num1,num2);
		}
		if(num1<num2) {
			System.out.printf("%d < %d  \n", num1,num2);
		}
		if(num1<=num2) {
			System.out.printf("%d <= %d  \n", num1,num2);
		}
		if(num1 >num2) {
			System.out.printf("%d > %d  \n", num1,num2);
		}
		if(num1 >= num2) {
			System.out.printf("%d => %d  \n", num1,num2);
		}
		
	}

}
