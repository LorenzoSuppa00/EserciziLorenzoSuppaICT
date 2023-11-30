package esercizio19;

public class Studente {
	String nome;
	int voto;
	
	Studente(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}	
	
	public String dettagli() {
		 return "Alunno: " + this.nome + "/nVoto: " + this.voto;
	}
}
