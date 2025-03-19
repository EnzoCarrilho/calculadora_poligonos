package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Retangulo;

public class RetanguloDao {
	
	public static void criarRetangulo() {
		
		Retangulo retangulo = new Retangulo();
		Scanner reader = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um objeto Retângulo");
		System.out.print("Insira o valor da base:");
		
		retangulo.setBase(reader.nextDouble());
		
		System.out.print("Insira o valor da altura:");
		retangulo.setAltura(reader.nextDouble());
		
		retangulo.mostrarDados();
		
		reader.close();
	}

	
}
