package be.com.exercicio0;

public class ContaBancaria {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
}
