package esercizio3.implementazione;

public class MainTest {

	public static void main(String[] args) {
		
		Calciatore c = new Calciatore("Cristiano", "Ronaldo", "19/05/87", "Lisbona", "Real Madrid", "Attaccante",
				100000, "5", 11500);
		
		c.stampaDati();
		System.out.println("Lo stipendio mensile è: "+c.calcolaStipendioMensile());
		

	}

}
