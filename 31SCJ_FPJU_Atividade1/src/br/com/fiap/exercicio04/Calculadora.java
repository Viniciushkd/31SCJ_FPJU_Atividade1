package br.com.fiap.exercicio04;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Calculadora {

	static double valores[] = new double[2];
	static double resultado;

	public static void main(String[] args) {
		Operacoes operacoes = new Operacoes();

		while (true) {
			HashMap<String, Integer> hm = new HashMap<>();
			hm.put("Somar", 1);
			hm.put("Subitrair", 2);
			hm.put("Multiplicar", 3);
			hm.put("Dividir", 4);
			Object[] opcoes = hm.keySet().toArray();

			String opcao = (String) JOptionPane.showInputDialog(null, "Oque deseja fazer?", "Opções",
					JOptionPane.DEFAULT_OPTION, null, opcoes, null);
			if(opcao == null)
				break;
			
			try {
				int i = 0;
				while (true) {
					if (resultado != 0.0) {
						valores[0] = resultado;
						i++;
					}
					String valor = JOptionPane.showInputDialog(null, "Inserir valor:").replaceAll(",", ".");
					valores[i] = Double.parseDouble(valor);
					i++;
					if (i < 2) {
						continue;
					}
					break;
				}

				switch (hm.get(opcao)) {
				case 1:
					resultado = operacoes.adicionar(valores);
					System.out.println("Somado: " + valores[0] + " + " + valores[1]);
					break;
	
				case 2:
					System.out.println("Subtraido: " + valores[0] + " - " + valores[1]);
					resultado = operacoes.subtrair(valores);
					break;
	
				case 3:
					System.out.println("Multiplicado: " + valores[0] + " * " + valores[1]);
					resultado = operacoes.multiplicar(valores);
					break;
	
				case 4:
					if(valores[0] == 0 || valores[1] == 0)
						throw new Exception();
					System.out.println("Dividido: " + valores[0] + " \\ " + valores[1]);
					resultado = operacoes.dividir(valores);
					break;
				default:
					break;
				}
				System.out.println(resultado);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Inserir número válido");
			}
		}
	}
}
