package br.com.fiap.exercicio05;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		while (true) {
			try {
				String num = JOptionPane.showInputDialog(null, "Informe um n�mero:");
				System.out.println("Fatorial de " + num + " �: " + fatorial(Integer.parseInt(num)));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Inserir um n�mero");
			}
		}
	}

	private static int fatorial(int numero) throws Exception {
		return numero <= 1 ? 1 : fatorial(numero - 1) * numero;
	}
}
