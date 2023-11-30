package esercizio18;

public class Automobile {
	
	String marca;
	String modello;
	String anno;
	
	Automobile (String marca, String modello, String anno){
		this.marca = marca;
		this.anno = anno;
		this.modello = modello;
	}
	public String stampaDettagli() {
		return "Marca: " + marca + "\nModello: " + modello + "\nAnno: " + anno;
	}
}
