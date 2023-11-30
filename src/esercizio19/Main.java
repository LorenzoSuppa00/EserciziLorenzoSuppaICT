package esercizio19;

public class Main {

	public static void main(String[] args) {
		
		int somma = 0;
		int media = 0;
		
		Studente[] studenti = new Studente[5];
		studenti[0] = new Studente("Marco", 9);
		studenti[1] = new Studente("Luigi", 8);
		studenti[2] = new Studente("Anna", 7);
		studenti[3] = new Studente("Paola", 7);
		studenti[4] = new Studente("Caterina", 9);
		
		for (int i = 0; i < studenti.length; i++) {
			somma += studenti[i].voto;
			for (int j = 0; j < studenti.length; j++) {
				media = somma / studenti.length;
			}
			
		}
		System.out.println("Media voti alunni: " + media);
	}

}
