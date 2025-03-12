package br.com.engsenai;

import br.com.engsenai.model.Circunferencia;
import br.com.engsenai.model.Quadrado;
import br.com.engsenai.model.Retangulo;
import br.com.engsenai.model.Trapezio;
import br.com.engsenai.model.Triangulo;

public class Main {

	public static void main(String[] args) {
			
		Quadrado q1 = new Quadrado();
		q1.setLado(2);
		q1.mostrarDados();
		
		
		Retangulo r1 = new Retangulo();
		r1.setAltura(2);
		r1.setBase(2);
		r1.mostrarDados();
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(3);
		t1.setBase(2);
		t1.mostrarDados();
		
		Trapezio tr1 = new Trapezio();
		tr1.setBaseMaior(2);
		tr1.setBaseMenor(2);
		tr1.setAltura(2);
		tr1.mostrarDados();
		
		Circunferencia c1 = new Circunferencia();
		c1.setRaio(2);
		c1.mostrarDados();
		
		
		
		
	}

}
