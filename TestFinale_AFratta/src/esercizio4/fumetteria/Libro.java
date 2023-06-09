package esercizio4.fumetteria;

public class Libro {

	private String titolo;
	private String autore;
	private String anno_pubblicazione;
	private double costo;
	private String editore;

	public Libro(String titolo, String autore, String anno_pubblicazione, double costo, String editore) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.anno_pubblicazione = anno_pubblicazione;
		this.costo = costo;
		this.editore = editore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getAnno_pubblicazione() {
		return anno_pubblicazione;
	}

	public void setAnno_pubblicazione(String anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	@Override
	public String toString() {
		return "Titolo:" + titolo + ", autore:" + autore + ", anno_pubblicazione:" + anno_pubblicazione
				+ ", costo:" + costo + ", editore:" + editore;
	}

}
