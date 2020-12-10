package quickSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v[] = { 9,2,1,0,1,0};
		//separa(v, 0, 5);       // SELECIONA A POSICAO INICIO E FIM//
		quickSort(v, 0, 5);  // SELECIONA A POSICAO INICIO E FIM//
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		System.out.println(v[3]);
		System.out.println(v[4]);
		for(int i = 0; i<=5; i++) {
			System.out.printf(v[i] + " ");
		}	
	}

	public static int separa(int vet[], int ini, int fim) {
		int pivo = vet[ini], i = ini + 1, f = fim, aux;
		while (i <= f) {
			while (i <= fim && vet[i] <= pivo) {
				++i;
			}
			while (pivo < vet[f]) {
				--f;
			}
			if (i < f) {
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux;
				++i;
				--f;
			}
		}
		if (ini != f) {
			vet[ini] = vet[f];
			vet[f] = pivo;
		}
		return f;
	}

	public static void quickSort(int vet[], int ini, int fim) {
		int divisao;
		if (ini < fim) {
			// separa a partir do primeiro
			divisao = separa(vet, ini, fim);
			// ordena a primeira parte
			quickSort(vet, ini, divisao - 1);
			// ordena a segunda parte
			quickSort(vet, divisao + 1, fim);
		}
	}

}
