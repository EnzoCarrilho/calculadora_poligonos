package br.com.engsenai.model;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public void setBase(double base){
		if(base > 0) {
			this.base = base;
		}else {
			System.out.println("O valor inserido para base é inválido");
		}
	}
	
	public void setAltura(double altura){
		if(altura > 0) {
			this.altura = altura;
		}else {
			System.out.println("O valor inserido para altura é inválido");
		}
	}
	
	private double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	private double calcularPerimetro() {
		double perimetro = base  * 2 + altura * 2;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("Retângulo\nbase = " + base);
		System.out.println("altura = " + altura);
		System.out.println("área do retangulo = " + String.format("%.1f", calcularArea()));
		System.out.println("perímetro do retangulo = " + String.format("%.1f", calcularPerimetro()));
		System.out.println("----------------------------------------------------------");
	}
}
