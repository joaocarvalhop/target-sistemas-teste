package questoes;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

/*3) Dado um vetor que guarda o valor de faturamento di�rio de uma distribuidora, 
 * fa�a um programa, na linguagem que desejar, que calcule e retorne:
� O menor valor de faturamento ocorrido em um dia do m�s;
� O maior valor de faturamento ocorrido em um dia do m�s;
� N�mero de dias no m�s em que o valor de faturamento di�rio foi superior � m�dia mensal.

IMPORTANTE:
a) Usar o json ou xml dispon�vel como fonte dos dados do faturamento mensal;

b) Podem existir dias sem faturamento, como nos finais de semana e feriados. 
Estes dias devem ser ignorados no c�lculo da m�dia;*/

public class Questao3 {

	public static void main(String[] args) {

		// dias sem faturamento 4, 5, 7, 11, 12, 18, 19, 25, 26
		double[] valor = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
				11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
				43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61 };

		double[] valorLimpo = { 22174.1664, 24537.6698, 26139.6134, 26742.6612, 42889.2258, 46251.174, 11191.4722,
				3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 35240.1826, 43829.1667, 18235.6852, 4355.0662,
				13327.1025, 25681.8318, 1718.1221, 13220.495, 8414.61 };

		// formatar para moeda real
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		Arrays.sort(valor); // isso ordena do menor para o maior
		double maior = valor[29]; // o maior valor fica na �ltima posi��o
		double menor = valor[0]; // e o menor na primeira

		System.out.println("Maior valor..." + dinheiro.format(maior) + "\nMenor valor...." + dinheiro.format(menor));

		double totalValor = 0;
		for (int i = 0; i < valorLimpo.length; i++) {
			totalValor += valorLimpo[i];
		}

		// 20.865,37
		double media = totalValor / valorLimpo.length;
		System.out.println("M�dia de faturamento mensal..." + dinheiro.format(media));

		// Foram 10 dias acima dessa m�dia
		for (int i = 0; i < valorLimpo.length; i++) {
			if (valorLimpo[i] > media) {
				System.out.print(dinheiro.format(valorLimpo[i]) + ", ");
			}
		}

	}

}
