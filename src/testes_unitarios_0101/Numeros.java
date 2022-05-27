package testes_unitarios_0101;

public class Numeros {

	public int soma(int numero1, int numero2) {
		return numero1+numero2;
	}
	
	public double raizQuadrada(double numero) {
		return Math.sqrt(numero);
	}
	
	public double raizCubica(int numero) {
		return Math.cbrt(numero);
	}
	
	public int fatorial(int numero) {
		int fatorial = 1;
		for(int i=1; i<numero;  numero--) {
			fatorial = fatorial*numero;
		}
		return fatorial;
	}
	public int somaIntervalo(int numero) {
		int soma = numero;
		for(int i=0; i<numero; i++) {
			soma = soma+i;
		}
		return soma;
	}
}
