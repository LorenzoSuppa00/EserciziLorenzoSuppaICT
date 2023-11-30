package esercizio17;
// ESERCIZIO 17
public class Main {

	public static void main(String[] args) {
		Libro[] libri = new Libro[2];
		libri[0] = new Libro("1) ", "Il Signore degli Anelli", "J.R.R Tolkien");
		libri[1] = new Libro("2) ", "Harry Potter e il calice di fuoco", "J.K Rowling");
		
		System.out.println(libri[0].stampaDettagli());
		System.out.println(libri[1].stampaDettagli());
		

	}

}
