package br.com.exercicio3;

public class Retangulo {
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		if(base <= 0 || altura <= 0) {
			this.base = 1;
			this.altura = 1;
		}else {
			this.base = base;
			this.altura = altura;
		}
	}
	
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	public int calculaArea() {
		
		int area = this.base*this.altura;
		
		return area;
	}
	
	public int calculaPerimetro() {
		return this.base*2+this.altura*2;
	}
	
}