package Vetor;

import java.util.Scanner;
	public class VetorInteiros {

	public static void main(String[] args) {
		
		Scanner lerNumero = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int posicao = 0;
		int calSoma = 0;
		String numExistente = "verificar numExistente";
		
		int[] vetorInteiros = new int[5];

		vetorInteiros[0]=1;
		vetorInteiros[1]=2;
		vetorInteiros[2]=3;
		vetorInteiros[3]=4;
		vetorInteiros[4]=5;
		
		String [] vetorInteiro = new String[] {"1", "2","3", "4","5"};
				
		for (int i =0; i < vetorInteiros.length; i++) {	
		System.out.println(vetorInteiros[i]);
}		
	for (int i = 0; i < vetorInteiros.length; i++) {
		if (vetorInteiros[i]> maior){
			maior = vetorInteiros[i];
		}
	}
	for (int i = 0; i < vetorInteiros.length; i++) {
		if(vetorInteiros[i] < menor){
			menor = vetorInteiros[i];
			
	for (int j = 0; j < vetorInteiros.length; j++) {
		calSoma = calSoma + vetorInteiros[j];
		}	
	}
}
		System.out.println("digite um numero: ");
		int i = lerNumero.nextInt();
		posicao = vetorInteiros[i];
		System.out.println(lerNumero);
	
	
	System.out.println("o maior numero do vetor é igual a: " + maior);
	System.out.println("o menor numero do vetor é igual a: " + menor);
	System.out.println("a soma dos vetores é igual a: "  + calSoma);
	
		}
}