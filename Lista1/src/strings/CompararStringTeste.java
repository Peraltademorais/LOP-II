package strings;

import java.util.Scanner;
public class CompararStringTeste {
	
	public static void main (String vet[]) { //args ou vet pode ser usado, tanto faz, o importante é estar passando um array como string
		CompararString objeto = new CompararString();
		Scanner objCapDados= new Scanner(System.in);
		int idCurso =-1;
		String nomeAluno ="";
		System.out.print("Digite o id do curso: ");
		idCurso= objCapDados.nextInt();
		System.out.print("Digite o nome do aluno: ");
		nomeAluno= objCapDados.next();
		objeto.recuperaDados(nomeAluno, idCurso);
		
	}

}
