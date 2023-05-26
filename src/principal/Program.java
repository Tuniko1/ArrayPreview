package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	/**Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno e mostre a media;
	 * Faça um programa que receba 50 números, mostre os números pares  contidos em cada posição do vetor
	 *e a sua posição (indice) do vetor;
	 *Usando o random faça uma simulação de um sorteio, cadastrando 10 pessoas,
	 *apenas uma pessoa será a ganhadora para a proxima turma de java do senai;
	 */
		Scanner sc = new Scanner(System.in);
		Random randon = new Random();
		
		
		System.out.println("Digite o nome do Aluno: ");
		String nome = sc.nextLine();
		
		double[] notas = new double[4];
		int[] vetor = new int[5];
		double somaNotas = 0;
		int op = randon.nextInt(2);
		String[] nomes = new String [10];
		
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Insira o valor da " + (i + 1) + "ª nota bimestral: ");	
			notas [i] = sc.nextDouble();
			somaNotas += notas[i];		
		}
		System.out.println("A média do(a) "+nome+" é: "+somaNotas / notas.length);			
		System.out.println();
		
		for(int j = 0; j < vetor.length; j++) {
			System.out.println("Insira o "+(j + 1)+"° número: ");
			int numero = sc.nextInt();
			vetor[j] = numero;
			
		}
						
		for (int j = 0; j < vetor.length; j++) {
		if (vetor[j] % 2 == 0 ){
			System.out.print(vetor[j]+" é Par! índice --> "+j+" ");
			System.out.println();
			}		
		}
		for(int k = 0; k < nomes.length; k++) {
			System.out.println("Insira o nome do participante do sorteio: ");
			nomes [k] = sc.nextLine();
			System.out.println("Insira um número: ");
			int n1 = sc.nextInt();
			
			if(op == n1) {
				System.out.println("o número: "+op+" foi sorteado e o vencedor é: "+nomes);
			}
		}
		
		sc.close();				
		
	}
}
