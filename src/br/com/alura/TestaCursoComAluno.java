package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleçoes do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando Aula", 11));
		javaColecoes.adiciona(new Aula("Modelando Coleçoes", 81));
		
		Aluno a1 = new Aluno("Guilherme", 1001);
		Aluno a2 = new Aluno("Paulo Silveira", 1002);
		Aluno a3 = new Aluno("Matheus Ferreira", 10);
		Aluno a4 = new Aluno("João Kleber", 99);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a ->{
			System.out.println(a);
			
		});
		
	}

}
