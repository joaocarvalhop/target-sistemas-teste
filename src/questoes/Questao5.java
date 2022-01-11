package questoes;

import java.util.Scanner;

/*5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de 
sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;*/

public class Questao5 {

	static String reverseIt(String str, int index) {

		if (index == 0) {
			return str.charAt(0) + "";
		}

		char letter = str.charAt(index);
		return letter + reverseIt(str, index - 1);
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma palavra...");

		String str = entrada.next().trim();

		// Escolhi utilizar a recursividade em Java, que consiste em uma técnica na
		// qual uma função se chama a si mesma repetidamente até a condição de base.
		String reverseStr = reverseIt(str, str.length() - 1);

		System.out.println("Palavra invertida..." + reverseStr);

		entrada.close();
	}

}
