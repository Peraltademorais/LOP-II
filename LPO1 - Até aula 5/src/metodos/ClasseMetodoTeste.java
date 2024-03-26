package metodos;

import java.util.Scanner;

public class ClasseMetodoTeste {
		
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			ClasseMetodo obj= new ClasseMetodo(3,"teste");
			String nome, aux;
			int semestre;
			System.out.print("Digite o nome do curso:");
			nome= input.nextLine();
			System.out.print("Digite o semestre:");
			semestre = input.nextInt();
			obj.mostrarMensagem(nome);
			obj.setNomeCurso(nome);
			obj.setSemestre(semestre);
			aux= obj.getNomeCurso();
			System.out.println("Retornou via get:"+aux);
			// Ou, para substituir as linhas 15 e 16 acima para imprimir:
			//System.out.println("Retornou do get: "+obj.getNomeCurso());
			System.out.println("Retornou via get o nome:"+obj.getNomeCurso());
			System.out.println("Retornou via get o semesetre:"+obj.getSemestre());
			
			
	}

}
