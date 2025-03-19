package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Quadrado;

public class QuadradoDao {
	
	public static void criarQuadrado() {
		
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Insira o valor do lado do quadrado");
		
		Scanner reader = new Scanner(System.in);
		
		quadrado.setLado(reader.nextDouble());
		quadrado.mostrarDados();
		
		reader.close();
		
		
	}
	
}
