package Lista1;
import java.util.Scanner;

public class Exercicio1Teste {
	
	public static void main(String args[]) {
		Exercicio1 objeto = new Exercicio1();
		Scanner objCapDados = new Scanner(System.in);
		int a =-1;
		int b =-1;
		int c =-1;
		System.out.print("Digite um número: ");
		a = objCapDados.nextInt();		
		System.out.print("Digite outro número: ");
		b = objCapDados.nextInt();		
		System.out.print("Digite mais um número: ");
		c = objCapDados.nextInt();	
		String num = objeto.somar(a,b,c);
		System.out.println(num);
	}

}
