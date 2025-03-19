package br.com.engsenai.model;

public class Trapezio {
	
	private double basemenor;
	private double basemaior;
	private double altura;
	
	public void setBaseMenor(double basemenor) {
		if(basemenor > 0) {
			this.basemenor = basemenor;
		}else {
			System.out.println("O valor inserido para base menor é inválido");
		}
	}
	
	public void setBaseMaior(double basemaior) {
		if(basemaior > 0) {
			this.basemaior = basemaior;
		}else {
			System.out.println("O valor inserido para base maior é inválido");
		}
	}
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}else {
			System.out.println("O valor inserido para altura é inválido");
		}
	}
	
	private double calcularArea() {
		
		double area = (basemaior + basemenor) * altura / 2;
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Trapézio\nbase maior = " + basemaior);
		System.out.println("base menor = " + basemenor);
		System.out.println("altura = " + altura);
		System.out.println("área do trapézio = " + String.format("%.1f", calcularArea()));
		System.out.println("----------------------------------------------------------");
	}
}
