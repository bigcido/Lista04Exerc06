package controller;
import br.edu.fateczl.ordenacao.bubblesort.*;
import br.edu.fateczl.ordenacao.mergesort.*;
import br.edu.fateczl.ordenacao.quicksort.*;

public class Bibliotecas {

	public Bibliotecas() {
		super();
	}
	
	public void DuracaoTempo(int [] vetor) {
		BubbleSort bubblesort = new BubbleSort();
		MergeSort mergesort = new MergeSort();
		QuickSort quicksort = new QuickSort();
		
		
		int[] vetor_saida;
		
		long TimeInicial = System.nanoTime();
		vetor_saida = bubblesort.BubbleSort(vetor);
		long TimeEnd = System.nanoTime();
		System.out.printf("BubbleSort: %5f [s]\n", (TimeEnd - TimeInicial) / (Math.pow(10,9)));
		
		TimeInicial = System.nanoTime();
		vetor_saida = mergesort.Msort(vetor);
		TimeEnd = System.nanoTime();
		System.out.printf("MergeSort: %5f [s]\n", (TimeEnd - TimeInicial) / (Math.pow(10,9)));
		
		TimeInicial = System.nanoTime();
		vetor_saida = quicksort.misto(vetor);
		TimeEnd = System.nanoTime();
		System.out.printf("QuickSort: %5f [s]\n", (TimeEnd - TimeInicial) / (Math.pow(10,9)));
		
	}
	
	
}
