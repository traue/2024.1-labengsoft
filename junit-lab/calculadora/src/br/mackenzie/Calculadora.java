package br.mackenzie;

public class Calculadora {

	public double somar(double vA, double vB) {
		return vA + vB;
	}

	public double subtrair(double vA, double vB) {
		return vA - vB;
	}

	public double multiplicar(double vA, double vB) {
		return vA * vB;
	}

	public double dividir(double vA, double vB) {
		if (vB == 0)
			return Double.NaN;

		return vA / vB;
	}

}
