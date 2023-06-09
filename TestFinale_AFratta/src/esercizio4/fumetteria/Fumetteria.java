package esercizio4.fumetteria;

import java.util.Arrays;

public class Fumetteria {

	private String nome;
	private String via;
	private String titolare;
	private int num_fumetti_max;
	Fumetto[] fumetti;

	public Fumetteria(String nome, String via, String titolare, int num_fumetti_max, Fumetto[] fumetti) {
		super();
		this.nome = nome;
		this.via = via;
		this.titolare = titolare;
		this.num_fumetti_max = num_fumetti_max;
		this.fumetti = fumetti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public int getNum_fumetti_max() {
		return num_fumetti_max;
	}

	public void setNum_fumetti_max(int num_fumetti_max) {
		this.num_fumetti_max = num_fumetti_max;
	}

	public Fumetto[] getFumetti() {
		return fumetti;
	}

	public void setFumetti(Fumetto[] fumetti) {
		this.fumetti = fumetti;
	}

	@Override
	public String toString() {
		return "Fumetteria nome:" + nome + ", via:" + via + ", titolare:" + titolare + ", num_fumetti_max:"
				+ num_fumetti_max + ", fumetti:\n" + Arrays.toString(fumetti);
	}

	public void stampaDati() {
		System.out.println(this.toString());
	}
}
