package Lista1;


public class Exercicio1 {
	
	public String somar(int a, int b, int c) {
		String num= "";
		if(a+b<c) {
		num = "A soma de " + a + b + "é menor que " + c;	
		}
		else {
		num = "Erro! A soma de" + a + b + "é maior que " + c;
		
		}
		return num;
		
}// fim método
	
}
