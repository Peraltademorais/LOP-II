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
		saida="C�digo Inv�lido";
	}
	return saida;
	
	}// fim m�todo
	
public void recuperaDados(String nomeAluno, int idCurso) {
		String nomeCurso = this.Cursos(idCurso);
		if (!nomeCurso.equals("C�digo Inv�lido")) {
			System.out.println("Bem-vindo " + nomeAluno+ " ao curso " +nomeCurso);
		}
		else {// c�digo != 1,2,3,4 ou 5
			System.out.print(nomeCurso);
		}
	}
	
}