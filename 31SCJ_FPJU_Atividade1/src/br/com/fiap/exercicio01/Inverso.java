package br.com.fiap.exercicio01;

import javax.swing.JOptionPane;

public class Inverso {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null, "Insira um texto");
		
		int c = texto.length();
		int b = c;
		int a = 0;
		System.out.print("Original: " + texto + "\nInverso:  ");
		while(c > 0) {
			System.out.print(texto.charAt((b-a)-1));
			c --;
			a++;
		}
	}
}
