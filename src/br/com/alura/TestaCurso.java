package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole�oes do java", "Paulo Silveira");
			
			javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
			javaColecoes.adiciona(new Aula("Criando Aula", 11));
			javaColecoes.adiciona(new Aula("Modelando Cole�oes", 81));
			
	}

}
