package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Trapezio;

public class TrapezioDao {
	
	public static void criarTrapezio() {
		
		Trapezio trapezio = new Trapezio();
		Scanner reader = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um objeto Trapézio");
		System.out.print("Informe o valor da base maior: ");
		trapezio.setBaseMaior(reader.nextDouble());
		
		System.out.print("Informe o valor da base menor: ");
		trapezio.setBaseMenor(reader.nextDouble());
		
		System.out.print("Informe o valor da altura: ");
		trapezio.setAltura(reader.nextDouble());
		
		trapezio.mostrarDados();
		
		reader.close();
		
	}
	
}
