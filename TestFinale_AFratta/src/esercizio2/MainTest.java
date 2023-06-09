package esercizio2;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		do {
			System.out.println("Se non si vogliono effettuare inserimenti digitare -1");
			System.out.println("Inserire un voto: ");

			a = s.nextInt();
			s.nextLine();
			if (a < 18 || a > 30) {
				System.out.println("valore inserito non corretto!");
			} else
				System.out.println("voto inserito correttamente");

		} while (a != -1);

		s.close();
	}

}
