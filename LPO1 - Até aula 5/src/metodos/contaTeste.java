package metodos;

import java.util.Scanner;

public class contaTeste {

public static void main(String args[]) {
	
	conta conta1 = new conta(50.00,"Maria");// criando um objeto do tipo conta
	conta conta2 = new conta(-7.52,"José");// criando um objeto do tipo conta
	
	//exibindo o saldo inicial dos objetos
	
	System.out.println("Balanço da conta1: " + conta1.getBalanco());
	System.out.println("Balanço da conta2: " + conta2.getBalanco());
	
	//criar objeto scanner
	
	Scanner input = new Scanner(System.in);
	double deposito;// deposito lido pelo usuário
	System.out.print("Digite o deposito para a conta1: ");
	deposito = input.nextDouble();//entrada do usuário
	//adicionando valor a Conta 1
	conta1.Deposito(deposito);
	
	//exibindo saldos atuais
	
	System.out.println("balanço da conta1: " + conta1.getBalanco());
	System.out.println("balanço da conta2: " + conta2.getBalanco());
	
	System.out.println("Digite o deposito para conta2: ");
	deposito = input.nextDouble();
	conta2.Deposito(deposito);
	
	System.out.println("balanço da conta1: " + conta1.getBalanco());
	System.out.println("balanço da conta2: " + conta2.getBalanco());
	
	double valor;
	System.out.println("Digite o valor que deseja sacar da conta 1: ");
	valor = input.nextDouble();
	if(conta1.Saque(valor)!=-1) {
		System.out.println("Saque realizado com sucesso");
	}
	else {
		System.out.println("Saque não realizado!");
	}
	
	System.out.println("balanço da conta1: " + conta1.getBalanco());
	System.out.println("balanço da conta2: " + conta2.getBalanco());
	
	System.out.println("Digite o valor que deseja sacar da conta 2: ");
	valor = input.nextDouble();
	if(conta2.Saque(valor)!=-1) {
		System.out.println("Saque realizado com sucesso");
	}
	else {
		System.out.println("Saque não realizado!");
	
	System.out.println("balanço da conta1: " + conta1.getBalanco());
	System.out.println("balanço da conta2: " + conta2.getBalanco());

		}
	conta1.setNomeTitular("Maria Paula");
	System.out.println("O nome atualizado do titular da conta 1 é"+ conta1.getNomeTitular());
	
	
	}
}
