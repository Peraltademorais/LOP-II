package metodos;


public class conta {
	private double balanco; //armazena o saldo
	private String nomeTitular;
	public conta(double s, String nome) {
		nomeTitular= nome;
		if(s > 0.0) {
			balanco = s ;
		}
	}
	
	public void setNomeTitular (String nome) {
		nomeTitular=nome;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	//construtor
	public conta(double balancoInicial) {
		if (balancoInicial >0.0) {
			balanco=balancoInicial;
		}
	}//fim construtor
	//realizar depoisto
	public void Deposito (double acrescimo) {
		balanco = balanco + acrescimo;
	}
	
	public double Saque(double valor) {
		if (valor <= balanco ){
			balanco = balanco - valor;
			return valor;
		}
	return -1.0;
	}
	
	//retornar saldo da conta
	
	public double getBalanco() {
		return balanco;
	}
}
