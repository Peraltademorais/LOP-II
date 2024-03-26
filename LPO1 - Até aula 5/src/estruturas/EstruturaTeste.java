package estruturas;
import java.util.Scanner;

public class EstruturaTeste {
	public static void main (String args[] ) {
		
		Scanner input = new Scanner(System.in);
		
		EstruturaCondicional obj1 =new EstruturaCondicional();
		int nota;
		boolean resultado = obj1.verificarIdade();	
		double a, b;
		int numeroprimo;
		String operador;
		
		System.out.println("maior de idade? " + resultado);
		
		System.out.println("Digite a nota do aluno");
		nota= input.nextInt();
		System.out.println(obj1.verificarNota(nota));
		
		System.out.println("Digite o numerador: ");
		a= input.nextDouble();
		System.out.println("Digite o denominador: ");
		b= input.nextDouble();
		System.out.println("Digite a operação que quer realizar: ");
		operador= input.next();
		
		System.out.println("O resultado no cálculo é: " + obj1.calcular(a, b, operador));
		
		System.out.println("Digite um numero: ");
		numeroprimo = input.nextInt();
		System.out.println("Numero primo"+ obj1.verificarPrimo(numeroprimo));
		
		input.close();
		
	}	
}
