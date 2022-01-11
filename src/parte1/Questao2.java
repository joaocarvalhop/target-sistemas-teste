package parte1;

/*2) Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor sempre ser� a soma 
 *dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na 
 *linguagem que desejar onde, informado um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne 
 *uma mensagem avisando se o n�mero informado pertence ou n�o a sequ�ncia.

IMPORTANTE:
Esse n�mero pode ser informado atrav�s de qualquer entrada de sua prefer�ncia ou pode ser 
previamente definido no c�digo;*/

public class Questao2 {

	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void main(String[] args) {

		// Imprime os 30 primeiros n�meros
		for (int i = 0; i < 30; i++) {
			System.out.print("(" + i + "):" + Questao2.fibo(i) + "\t");
		}

	}

}
