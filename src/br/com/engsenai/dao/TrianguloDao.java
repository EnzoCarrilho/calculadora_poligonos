package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Triangulo;

public class TrianguloDao {
	
	public static void criarTriangulo() {
		
		Triangulo triangulo = new Triangulo();
		Scanner reader = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Insira o valor da base:");
		triangulo.setBase(reader.nextDouble());
		
		System.out.print("Insira o valor da altura:");
		triangulo.setAltura(reader.nextDouble());
		
		triangulo.mostrarDados();
		reader.close();
	}
	
}
