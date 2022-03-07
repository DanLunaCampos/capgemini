package encontrarmediana;

import java.util.Scanner;

//Danilo Luna Campos, desafio Capgemini, Mediana

public class Mediana {

	public static void main(String[] args) {
		/* Mediana
		 * 
		 * (Quantidade + 1) / 2
		 * Se a quantidade de números for ímpar, obtem-se a mediana.
		 * Se a quantidade de números for par, será solicitado mais um elemento.
		 */
		
        Scanner s = new Scanner(System.in);

        System.out.println("Defina quantos elementos irá digitar, escolha um número ímpar:");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("Digite os elementos:");
        
        for(int i=0;i<n;i++){//para ler o array
            arr[i]=s.nextInt();

        }
        System.out.println("Os números digitados foram:");
        for(int i: arr){ //para printar o array
            System.out.println(i);

        }
			
		// arr = [9, 2, 1, 4, 6] = 5 elementos
		// 0 => 9;
		// arr.get(2) => 1

		//Se o conjunto é ímpar:
		if (arr.length % 2 != 0) {
			int posicaoNumero = ((arr.length + 1) / 2) - 1;
			System.out.println("A mediana é: " + arr[posicaoNumero]);
		} else {
			//Se o conjunto é par:
			System.out.println("Você digitou um conjunto com um número par de elementos. Reinicie o programa"
					+ " e digite um array com um conjunto ímpar!");
		//}
				
		}

	}
}


