package metodos;

public class ClasseMetodo {
	
	private String nomeCurso;
	private int semestre;
	
	public ClasseMetodo(int semestre, String nomeCurso) {
		this.semestre= semestre;
		this.nomeCurso= nomeCurso;
		
	}
	
	public void setSemestre( int semestre) {
		this.semestre= semestre;
	}
	
	public int getSemestre() {
		return semestre;
	}
	
	public void setNomeCurso (String arg) {
		nomeCurso= arg;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	
	public void mostrarMensagem (String nomeCurso) {
		System.out.println("Bem-vindo ao curso:" + nomeCurso);
		
	}// fim metodo
}// fim class
