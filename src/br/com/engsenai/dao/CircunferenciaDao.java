package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Circunferencia;

public class CircunferenciaDao {
	
	public static void criarCircunferencia() {
		
		Circunferencia circunferencia = new Circunferencia();
		Scanner reader = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Insira o valor do raio:");
		circunferencia.setRaio(reader.nextDouble());
		
		circunferencia.mostrarDados();
		reader.close();
		
	}
	
}
