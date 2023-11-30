package esercizio17;
public class Libro {
String titolo;
String autore;
String posizione;

Libro(String posizione, String titolo, String autore) {
	this.titolo = titolo;
	this.autore = autore;
	this.posizione = posizione;
}	

public String stampaDettagli() {
	System.out.println(posizione);
	String dettagli = "Titolo: " + this.titolo + "\nAutore: " + this.autore;
	return dettagli;
}

}