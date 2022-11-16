package Classes;

import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja informar: ");
		int qtdNotas = entrada.nextInt();
		
		
		double[] notasAluno = new double[qtdNotas];
		
		
		for(int i = 0; i < notasAluno.length; i++) {
			System.out.println("Digite a nota " + (i + 1 + ": ") + " ");
			notasAluno[i] = entrada.nextDouble();
		}
		
		System.out.println("Digite a nota de corte: ");
		double notaCorte = entrada.nextDouble();
		
		double mediaAluno = 0;
		for (double media: notasAluno) {
			mediaAluno += media;
		}
		
		double mediaTotal = mediaAluno / notasAluno.length;
		System.out.printf("\nSua m�dia �: %.1f", mediaTotal + ".");
		
		if (mediaTotal > notaCorte) {
			System.out.println("Parab�ns!\nVoc� foi Aprovado!");
		} else
			System.out.println("Voc� est� Reprovado!\nBoa sorte na pr�xima.");
		
		
		entrada.close();
		
		
	}

}
