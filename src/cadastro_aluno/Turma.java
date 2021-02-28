
//Elson manzalli da silva RA: 0040961923030 


package cadastro_aluno;

public class Turma {
	private Aluno alunos[];
	private int qtdAulas;
	private String nomeCurso;
	private int matriculados;

	public Turma(int qtdAulas, String nomeCurso) {
		this.qtdAulas = qtdAulas;
		this.nomeCurso = nomeCurso;
		alunos = new Aluno[20];
		matriculados = 0;
	}

	public void incluirAluno(Aluno al) throws Exception {

		for (int i = 0; i < matriculados; i++) {
			if (alunos[i].getCodAluno() == al.getCodAluno()) {
				Exception exc = new Exception("Aluno já Matriculado");
				throw exc;
			}
		}

		if (matriculados == 20) {
			Exception exc = new Exception("Turma Cheia!!");
			throw exc;
		} else {
			alunos[matriculados] = al;
			alunos[matriculados].matriculadoNovo();
			matriculados++;
		}

	}

	private int buscarAluno(int codigo) {
		for (int i = 0; i < matriculados; i++) {
			if (alunos[i].getCodAluno() == codigo) {
				return i;
			}
		}
		return -1;

	}

	public void registrarFalta(int codigo) throws Exception {
		verificaAluno(codigo);
		alunos[buscarAluno(codigo)].adicionarFaltas();

	}

	public void atribuirNota(int codigo, double nota) {
		if (nota >= 0 && nota <= 10)
			alunos[buscarAluno(codigo)].setNotaFinal(nota);
	}

	public void listarAlunos() {
		nomeDoCurso();

		for (int i = 0; i < matriculados; i++) {
			alunos[i].dadosAluno(qtdAulas);
		}
	}

	public void listarAprovados() {
		nomeDoCurso();
		for (int i = 0; i < matriculados; i++) {
			if (alunos[i].getNotaFinal() > 6 && alunos[i].frequencia(qtdAulas) > 75) {
				alunos[i].dadosAluno(qtdAulas);
			}
		}

	}

	private void nomeDoCurso() {
		System.out.println("\n\n\n--------------------------------" + nomeCurso  + "--------------------------------\n");
	}

	private void verificaAluno(int codigo) throws Exception {
		int existe = 0;
		for (int i = 0; i < matriculados; i++) {
			if (alunos[i].getCodAluno() == codigo) {
				existe++;
			}
		}

		if (existe <= 0) {
			Exception exc = new Exception("Aluno não Matriculado nessa turma");
			throw exc;
		}
	}
}
