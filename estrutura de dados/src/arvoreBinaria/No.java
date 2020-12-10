/*@author Diego Lins
 * @version 19/11
 */
package arvoreBinaria;

public class No {
	int elemento;
	No esquerda, direita;
	
	No(int e){
		elemento = e;
		esquerda = null;
		direita = null;
	}
}