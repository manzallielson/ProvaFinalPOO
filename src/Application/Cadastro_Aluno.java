
//Elson manzalli da silva RA: 0040961923030 


package Application;

import cadastro_aluno.Aluno;
import cadastro_aluno.Turma;

public class Cadastro_Aluno {

	
	public static void main(String[] args) {
		Aluno alunos[] = new Aluno[4];

		alunos[0] = new Aluno(121212, "CLEBERSON EUGÊNIO FORTE" );
		alunos[1] = new Aluno(131313, "FRANCESCO ARTUR PERROTTI");
		alunos[2] = new Aluno(141414, "BENEDITO APARECIDO CRUZ");
		alunos[3] = new Aluno(151515, "ELSON MANZALLI DA SILVA");

		Turma turma = new Turma(40, "PROGRAMACAO ORIENTADA OBJETOS");

		try {
			turma.incluirAluno(alunos[0]);
			turma.incluirAluno(alunos[1]);
			turma.incluirAluno(alunos[2]);
			turma.incluirAluno(alunos[3]);
			
			
			turma.atribuirNota(alunos[0].getCodAluno(), 5);
			turma.atribuirNota(alunos[1].getCodAluno(), 10);
			turma.atribuirNota(alunos[2].getCodAluno(), 9);
			turma.atribuirNota(alunos[3].getCodAluno(), 9.5);

			turma.registrarFalta(alunos[2].getCodAluno());
			turma.registrarFalta(alunos[2].getCodAluno());
			turma.registrarFalta(alunos[2].getCodAluno());
			turma.registrarFalta(alunos[0].getCodAluno());
			turma.registrarFalta(alunos[0].getCodAluno());
			turma.registrarFalta(alunos[2].getCodAluno());
			turma.registrarFalta(alunos[3].getCodAluno());
			turma.registrarFalta(alunos[3].getCodAluno());
			turma.registrarFalta(alunos[3].getCodAluno());

			


		} catch (Exception exp) {
			System.out.println(exp);
		}
		turma.listarAlunos();

		try {
			turma.incluirAluno(alunos[0]);
		} catch (Exception exp) {
			System.out.println(exp);
		}

		try {
			turma.registrarFalta(212121);
		} catch (Exception exp) {
			System.out.println(exp);
		}

		turma.listarAlunos();

		turma.listarAprovados();

		try {
			for (int i = 0; i < 22; i++) {
				Aluno al = new Aluno(i, "Aluno incluido");
				turma.incluirAluno(al);

			}

		} catch (Exception exp) {
			System.out.println(exp);
		}

	}

}
