
//Elson manzalli da silva RA: 0040961923030 


package cadastro_aluno;

public class Aluno {
	private int codAluno;
	private String nome;
	private double notaFinal;
	private int qtdFaltas;

	public Aluno(int codAluno, String nome) {
		this.codAluno = codAluno;
		this.nome = nome;

	}


	public int getCodAluno() {
		return codAluno;
	}

	
	public String getNome() {
		return nome;
	}

	
	public double getNotaFinal() {
		return notaFinal;
	}

	
	public void setNotaFinal(double mediaFinal) {
		this.notaFinal = mediaFinal;
	}

	
	public int getQtdFaltas() {
		return qtdFaltas;
	}

	
	public void adicionarFaltas() {
		this.qtdFaltas++;
	}

	public void matriculadoNovo() {
		notaFinal = 0.0;
		qtdFaltas = 0;
	}

	public void dadosAluno(double qtdAulas) {
		System.out.println("Nome: " + getNome() + 
				"\nCodigo: " + getCodAluno() +
				"\nNota Final: " + getNotaFinal() +  
				"\nQuantidade de Faltas: " + getQtdFaltas() +
				"\nFrequencia: " + frequencia(qtdAulas) + "\n\n");
	}

	public double frequencia(double qtdAulas) {
		return 100 - ((getQtdFaltas() / qtdAulas) * 100);
	}

}
