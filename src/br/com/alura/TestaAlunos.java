package br.com.alura;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Guilherme Carvalho");
		alunos.add("Nico Steppat");
		alunos.add("Felipe Araujo");
		
		boolean existe = alunos.contains("Guilherme Carvalho");
		System.out.println(existe);
		
		alunos.forEach(aluno -> { System.out.println(aluno);});
			
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}

}
