package br.com.engsenai.model;

public class Circunferencia {
	
	private double raio;
	
	public void setRaio(double raio) {
		if(raio > 0) {
			this.raio = raio;
		}else {
			System.out.println("O valor inserido para raio é inválido");
		}
	}
	
	private double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public void mostrarDados() {	
		System.out.println("----------------------------------------------------------");
		System.out.println("Circunferência\nraio = " + raio);
		System.out.println("área da circunferência = " + String.format("%.1f", calcularArea()));
		System.out.println("----------------------------------------------------------");
	}
	
	
	
}
