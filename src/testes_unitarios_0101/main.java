package testes_unitarios_0101;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Numeros numero = new Numeros();
		String n1 = JOptionPane.showInputDialog("Insira um numero:");
		int numero1 = Integer.parseInt(n1);
		JOptionPane.showMessageDialog(null, numero.raizCubica(numero1));
		JOptionPane.showMessageDialog(null, numero.fatorial(numero1));
		JOptionPane.showMessageDialog(null, numero.somaIntervalo(numero1));
		
		JOptionPane.showMessageDialog(null, "Exemplo passando dados!");
		JOptionPane.showMessageDialog(null, numero.soma(10, 20)); //30
		JOptionPane.showMessageDialog(null, numero.raizCubica(27));//3
		JOptionPane.showMessageDialog(null, numero.raizCubica(20));//2.71...
		JOptionPane.showMessageDialog(null, numero.fatorial(5));//120
		JOptionPane.showMessageDialog(null, numero.fatorial(0));//1
		JOptionPane.showMessageDialog(null, numero.somaIntervalo(5));//15
		JOptionPane.showMessageDialog(null, numero.somaIntervalo(0));//0
	}

}
