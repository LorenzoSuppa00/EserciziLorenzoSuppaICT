package esercizio18;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Automobile> auto = new ArrayList<Automobile>();
		
		Automobile ford1 = new Automobile("Ford", "Focus", "2005");
		Automobile renault = new Automobile("Renault","Capture","2014");
		Automobile hyundai = new Automobile("Hyundai","Tucson","2016");
		Automobile ford2 = new Automobile("Ford","Fiesta","2010");
		
		auto.add(ford1);
		auto.add(renault);
		auto.add(hyundai);
		auto.add(ford2);
		
		System.out.println("Che auto cerca? Mi dica un numero da 0 a 3.");
		
		for (int i = 0; i <= auto.size(); i++) {
				i = scan.nextInt();
				if(i < auto.size() && i > -1){
				System.out.println(auto.get(i).stampaDettagli());
				}
				else {
					System.out.println("Auto non presente nel catalogo.");
					scan.close();
			}
		}
	}
}






