package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* ArrayList (índice inicia-se em zero) (10,20,30) -> índice: (0, 1, 2)
		 
		int[] numeros = new int[5];
		int[] numeros2 = {100, 20, 30 ,40, 50};
		
		numeros[0] = 10;
		numeros[1] = 25;
		numeros[2] = 1;
		numeros[3] = 99;
		numeros[4] = 33;
		System.out.println(numeros [3]);
		System.out.println(numeros2 [0])*/;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos nomes deseja salvar na memória? ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String [qtd];
		
		//for usado para inserir os dados
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.println("Insira o nome: ");
			nomes [contador] = sc.nextLine();
			}
		
		//for usado para exibir os dados
		for (int contador = 0;contador < nomes.length; contador++) {
			System.out.println(nomes[contador]);
		
		//for each usado para exibir os dados percorrendo por todo registro do array
		}for (String nome : nomes) {
			System.out.println(nome);
		}
		
		sc.close();
		/*
		String verificar = "Arthur";
		if(nomes [0].equals(verificar)) {
			System.out.println("É igual");		
		}
		
		String nome1 = new String("Arthur");
		String nome2 = new String("Arthur");
		//String nome3 = "Arthur";
		
		System.out.println(nome1.equals(nome2));
		*/
		
	}
}
