/**
 * 
 */
package diferenca;

import java.util.Arrays;
import java.util.Scanner;

//Danilo Luna Campos, desafio Capgemini, Diferen�a
public class dif {

	public static void main(String[] args) {
		/* Diferen�a
		 * 
		 */
		
        Scanner s = new Scanner(System.in);

        System.out.println("Defina quantos elementos ir� digitar: ");

        int a=s.nextInt();

        int arr[]=new int[a];

        System.out.println("Digite os elementos:");
        
        for(int i=0;i<a;i++){//para ler o array
            arr[i]=s.nextInt();
        }
        System.out.println("Os n�meros digitados foram:");
        for(int i: arr){ //para printar o array
            System.out.println(i);
        }
        
        Arrays.sort(arr);
        System.out.println("Os n�meros digitados em ordem crescente foram: " + Arrays.toString(arr));
		
        System.out.println("Defina um n�mero 'x' para c�lculo da diferen�a: ");

        int x=s.nextInt();
        
        int cont = 0; // posi��o do contador
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i + 1; j < arr.length; j++)
        		if ((arr[i] - arr[j] == x || arr[j] - arr[i] == x))
                cont++; // vai para a pr�xima posi��o
            }
        
            System.out.println("O n�mero de itens com diferen�a " + x + " �: " + cont + ".");
              
	}
}


