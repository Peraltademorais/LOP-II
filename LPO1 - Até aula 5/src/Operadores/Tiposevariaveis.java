package Operadores;

public class Tiposevariaveis {
	
	public static void main (String args[]) {
		int a=2;// inteiro de 32 bits
		long b=2;//inteiro de 64 bits
		char c='a';//
		String d="oi";// conjunto de caracteres
		boolean e=true;// true ou false
		float f=2.1F;// ponto de precisão de 32 bits
		double g=2.0;// ponto de precisão 64 bits
		
		System.out.printf("Valor Inteiro \n%d\n" , a );
		System.out.printf("Valor Inteiro long \n%d\n" , b);
		System.out.printf("Valor Char \n%c\n" ,c);
		System.out.printf("Valor String \n%s\n" , d);
		System.out.printf("Valor boolean \n%b\n" , e);
		System.out.printf("Valor Inteiro \n%.2f\n", f);
		System.out.printf("Valor Inteiro \n%.2f\n " , g);
	}//fim main
}// fim da classe

//Esses são tipos primitivos, com excessão da string, se não for tipo primitivo é TAD (TIPO ABSTRATO DE DADO)

