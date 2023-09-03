package view;
import controller.Bibliotecas;
public class Principal {

	public static void main(String[] args) {
		Bibliotecas bibli = new Bibliotecas();
		int[] vetor = new int[1500];
		int tamanho = vetor.length;
		
		for (int i = 0; i < 1500; i++) {
			vetor[i] = tamanho - (i-1);
		}
		bibli.DuracaoTempo(vetor);
	}

}
