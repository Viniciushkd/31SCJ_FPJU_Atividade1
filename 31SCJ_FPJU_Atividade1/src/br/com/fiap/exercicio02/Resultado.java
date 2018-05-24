package br.com.fiap.exercicio02;

public class Resultado {

		public static void main(String[] args) {
			int a = 0, b = 0, c = 0;
			c = 1;
			b = 2;
			for (a = 1; a <= b; a++) {
				c++;
				if (c == 2) {
					continue;
				}
				c--;
			}
			System.out.println("a=" + a + ",b=" + b + ",c=" + c);
		} //3,2,2
}
