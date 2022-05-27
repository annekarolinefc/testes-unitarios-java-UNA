package testes_unitarios_0102;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String p = JOptionPane.showInputDialog("Insira o seu peso:");
		String a = JOptionPane.showInputDialog("Insira a sua altura:");
		
		double peso = Double.parseDouble(p);
		double altura = Double.parseDouble(a);
		
		JOptionPane.showMessageDialog(null, "Peso: " + peso + "kg - Altura: " + altura + "m.");
		
		imc meuIMC = new imc();
		JOptionPane.showMessageDialog(null, "IMC: " + meuIMC.IMC(altura, peso));
		
	}

}
