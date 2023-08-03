package br.com.exercicio5;
import javax.swing.*;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	
	public void exibirInformacoes() {
		JOptionPane.showMessageDialog(null, "Marca do carro: "+this.marca
				+"\nModelo do carro: "+this.modelo
				+"\nAno do carro: "+this.ano);
	}
	
}