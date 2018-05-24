package br.com.fiap.exercicio03;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	static String numFunc;

	public static void main(String[] args) {
		List<Funcionario> listaFuncionario = new ArrayList<>();

		numFunc = JOptionPane.showInputDialog(null, "Quantos funcionários existem na empresa?");
		System.out.println("Número de funcionários: " + numFunc);
		System.out.println("---------");
		while (true) {
			try {
				double soma = 0;
				for (int i = 0; i < Integer.parseInt(numFunc); i++) {
					Funcionario func = new Funcionario();
					String nome = JOptionPane.showInputDialog(null, "Nome do funcionário:");
					String salario = JOptionPane.showInputDialog(null, "Salário do funcionário " + nome + ":").replace(",", ".");
					func.setNome(nome);
					func.setSalario(Double.parseDouble(salario));

					soma += func.getSalario();

					listaFuncionario.add(func);
					
					System.out.println("Nome: " + func.getNome());
					System.out.println("Salário: " + func.getSalario());
					System.out.println("---------");
				}
				System.out.println("\nMédia dos salários dos funcionários: " + soma / listaFuncionario.size());
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Inserir um número");
			}
		}
	}

}
