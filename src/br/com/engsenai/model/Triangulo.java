package br.com.engsenai.model;

public class Triangulo {
	
	private double base;
	private double altura;
	
	public void setBase(double base){
		if(base > 0) {
			this.base = base;
		}else {
			System.out.println("O valor inserido para base é inválido");
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
		
		double area = base * altura / 2;
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Triângulo\nbase = " + base);
		System.out.println("altura = " + altura);
		System.out.println("área do triângulo = " + String.format("%.1f", calcularArea()));
		System.out.println("----------------------------------------------------------");
	}
}


