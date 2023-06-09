package esercizio4.MainTest;
import esercizio4.fumetteria.Fumetto;
import esercizio4.fumetteria.Fumetteria;

public class MainTest {

	public static void main(String[] args) {
		
		Fumetto fumetto1 = new Fumetto("Topolino", "A", "2021", 9.99, "Edit1", "Informazioni aggiuntive", "Disegnatore1");
		Fumetto fumetto2 = new Fumetto("Pippo", "B", "2022", 12.99, "Edit2", "Trama", "Disegnatore2");
		Fumetto fumetto3 = new Fumetto("Pluto", "C", "2023", 14.99, "Edit3", "Indice", "Disegnatore3");

		Fumetto[] fumetti = {fumetto1, fumetto2, fumetto3};
		
		Fumetteria f = new Fumetteria("Fumetto&Go", "Viale della liberta'", "Antonio", 10, fumetti);
		
		f.stampaDati();

	}

}
