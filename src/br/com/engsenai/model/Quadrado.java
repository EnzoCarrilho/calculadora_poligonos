package br.com.engsenai.model;

public class Quadrado {
	
	private double lado;
	
	public void setLado(double lado){
		
		if(lado > 0) {
			this.lado = lado;
		}else {
			System.out.println("A medida inserida é inválida.");
		}
				
	}
	
	private double calcularArea() {
		
		double area = lado * lado;
		return area;	
	}
	
	private double calcularPerimetro(){
		
		double perimetro = lado * 4;
		return perimetro;
		
	}	
	
	public void mostrarDados(){
		System.out.println("----------------------------------------------------------");
		System.out.println("QUADRADO\nlado = " + lado);
		System.out.println("área do quadrado = " + String.format("%.1f", calcularArea()));
		System.out.println("perímetro do quadrado = " + String.format("%.1f", calcularPerimetro()));
		System.out.println("----------------------------------------------------------");
	}
	
}
