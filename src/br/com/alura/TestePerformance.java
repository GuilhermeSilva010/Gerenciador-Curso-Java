package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

	public static void main(String[] args) {
		
		//Teste de Performance de HashSet e uma ArrayList
		//Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numeros = new HashSet<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i < 50000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoExecucao = fim - inicio;
		
		System.out.println("Tempo Gasto : " + tempoExecucao);
		
	}

}
