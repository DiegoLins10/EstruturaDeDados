package mergeSort;

public class Main {

	public static void main(String[] args) {

		int v[] = {190, 71, 65, 180, 80, 50};
		mescla(v, 0, 2, 3, 5); // Seleciona a posição do inicio e fim//
		for(int i = 0; i<=5; i++) {
			System.out.printf(v[i] + " ");
		}	
	}

	public static void mescla(int v[], int iA, int fA, int iB, int fB) {

		int aux[] = new int[fB - iA + 1], ini = iA, iaux = 0;

		while (iA <= fA && iB <= fB) {
			if (v[iA] > v[iB]) {
				aux[iaux] = v[iA];
				iA++;
			} else {
				aux[iaux] = v[iB];
				iB++;
			}
			iaux++;
		}
		while (iA <= fA) {
			aux[iaux] = v[iA];
			iA++;
			iaux++;
		}

		while (iB <= fB) {
			aux[iaux] = v[iB];
			iB++;
			iaux++;
		}
		iaux = 0;
		for (int i = ini; i <= fB; iaux++, i++) {
			v[i] = aux[iaux];
		}
		
	}

}
