package parte1;

/*1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?*/

public class Questao01 {

	public static void main(String[] args) {

		int indice = 13, soma = 0, k = 0;
//apagar int soma = 0;
//apagar int k = 0;
		
		while (k < indice) {
			k = k + 1;
			soma = soma + k;
		}
		
		System.out.println(soma);
		
	}

}
