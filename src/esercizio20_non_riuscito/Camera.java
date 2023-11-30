package esercizio20_non_riuscito;

public class Camera {
	
	int numero;
	String stato;
	
	Camera(int numero, String stato){
		this.numero = numero;
		this.stato = stato;
	}

	public int getNumero() {
		return numero;
	}

	public String getStato() {
		return "La stanza è " + stato;
	}
	
	
}

