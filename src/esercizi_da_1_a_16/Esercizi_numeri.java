package esercizi_da_1_a_16;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
import java.util.Scanner;
public class Esercizi_numeri {

	public static void main(String[] args) {

//		ESERCIZIO 1

//		int x = 7;
//		if(x % 2 == 0) {
//			System.out.println("Il numero è pari");
//		}
//		else {
//			System.out.println("Il numero è dispari");
//		}
		
//		ESERCIZIO 2
		
//		int somma = 9 + 89 + 2 + 13 + 37;
//		System.out.println("Somma: " + somma);
		
//		ESERCIZIO 3 
/*		
 * 		Funziona ma non capisco perchè devo scrivere 2 volte 
 * 		il numero nella console per farmi dire se un valore è troppo basso o troppo alto,
 * 		solo al primo numero che scrivo nella console funziona al primo invio.
 * 
 *
 */
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int casuale = rand.nextInt(1, 100);
		System.out.println(casuale);
		
		int tentativo; // Perchè non int tentativo = scan.nextInt(); direttamente qui?
		
		do {
			System.out.println("Dimmi un numero da 1 a 100.");
			tentativo = scan.nextInt();
			if (tentativo < casuale) {
				System.out.println("Valore troppo basso");
				scan.nextInt();
			}
			else if (tentativo > casuale) {
				System.out.println("Valore troppo alto");
				scan.nextInt();
			}
			else {
				System.out.println("Valore corretto");
				
			}
			
		} while (tentativo != casuale);
		scan.close();
		
//		ESERCIZIO 4 (NON RIUSCITO)
		
//		ESERCIZIO 5 (NON RIUSCITO)
	
	}
    
}



	

		



		
		
		



