package br.com.fiap.exercicio03;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	static String numFunc;

	public static void main(String[] args) {
		List<Funcionario> listaFuncionario = new ArrayList<>();

		numFunc = JOptionPane.showInputDialog(null, "Quantos funcion�rios existem na empresa?");
		System.out.println("N�mero de funcion�rios: " + numFunc);
		System.out.println("---------");
		while (true) {
			try {
				double soma = 0;
				for (int i = 0; i < Integer.parseInt(numFunc); i++) {
					Funcionario func = new Funcionario();
					String nome = JOptionPane.showInputDialog(null, "Nome do funcion�rio:");
					String salario = JOptionPane.showInputDialog(null, "Sal�rio do funcion�rio " + nome + ":").replace(",", ".");
					func.setNome(nome);
					func.setSalario(Double.parseDouble(salario));

					soma += func.getSalario();

					listaFuncionario.add(func);
					
					System.out.println("Nome: " + func.getNome());
					System.out.println("Sal�rio: " + func.getSalario());
					System.out.println("---------");
				}
				System.out.println("\nM�dia dos sal�rios dos funcion�rios: " + soma / listaFuncionario.size());
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Inserir um n�mero");
			}
		}
	}

}
