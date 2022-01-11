package questoes;

import java.text.NumberFormat;
import java.util.Locale;

/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação 
que cada estado teve dentro do valor total mensal da distribuidora.*/

public class Questao4 {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");

		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double total = (sp + rj + mg + es + outros);

		// p = porcentagem
		double psp = (sp / total);
		double prj = (rj / total);
		double pmg = (mg / total);
		double pes = (es / total);
		double poutros = (outros / total);

		// formatar para porcentagem
		NumberFormat percentual = NumberFormat.getPercentInstance();

		// formatar para moeda real
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		System.out.println("Total do faturamento..." + dinheiro.format(total));
		System.out.println("Representação de SP..." + percentual.format(psp));
		System.out.println("Representação de RJ..." + percentual.format(prj));
		System.out.println("Representação de MG..." + percentual.format(pmg));
		System.out.println("Representação de ES..." + percentual.format(pes));
		System.out.println("Representação de outros estados..." + percentual.format(poutros));
	}

}
