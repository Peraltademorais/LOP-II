package strings;

public class CompararString {

	public String Cursos(int a) {
	String saida="";
	if(a==1) {
		saida="ADS";
	}
	else if(a==2) {
		saida="CD";
	}
	else if(a==3) {
		saida="GTI";
	}
	else if(a==4){
		saida="MK";
	}
	else if(a==5){
		saida="RH";
	}
	else {
		saida="Código Inválido";
	}
	return saida;
	
	}// fim método
	
public void recuperaDados(String nomeAluno, int idCurso) {
		String nomeCurso = this.Cursos(idCurso);
		if (!nomeCurso.equals("Código Inválido")) {
			System.out.println("Bem-vindo " + nomeAluno+ " ao curso " +nomeCurso);
		}
		else {// código != 1,2,3,4 ou 5
			System.out.print(nomeCurso);
		}
	}
	
}