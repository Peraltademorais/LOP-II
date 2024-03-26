package estruturas;
import java.util.Scanner;

public class EstruturaCondicional {
	
	public boolean verificarIdade() {
		Scanner obj= new Scanner(System.in);
		int idade;
		System.out.print("Digite a idade: ");
		idade= obj.nextInt();
		if( idade>=18 ) {
			
			return true;
		}
		
			return false;
	
		
	}//fim verificaridade
	public String verificarNota(int notaAluno) {
		if (notaAluno >=90) {
			return "NOTA A";
		}//FIM IF
		else if(notaAluno >=80) {
			return "NOTA B";
		}//FIM ELSE IF
		else if(notaAluno >=70) {
			return "NOTA C";
		}//FIM ELSE IF
		else {
			return "NOTA D";
		}// FIM ELSE
	}
	
	public double calcular(double num1, double num2, String operador) {
		double resultado = -11111;
		switch (operador) {
		case "+":
			resultado = num1 + num2;
		break;
		case "*":
			resultado = num1 * num2;
		break;
		case "-":
			resultado = num1 - num2;
		break;
		case "/":
			if(num2 > 0) {
				resultado = num1/num2;
				}
			else 
			{
				System.out.println("Operação inválida.");
			}
		break;
		
		default:
			System.out.println("Operador inválido");
		}
		
		return resultado;
	}
	
	public boolean verificarPrimo(int numero) {
		if (numero <= 1) {
			return false; //Números menores ou iguais a 1 não são primos
		}
		int divisor = 2;
		while (divisor <= numero/2) {
			if (numero % divisor ==0) {
				return false; //Se encontramos um divisor, o número não é primo
			}
			
			divisor++;
		}
		return true;
	

	}

}//FIM CLASSE
