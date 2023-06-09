package esercizio1;

public class MainTest {

	public static void main(String[] args) {
		
		int[] arr = {547, 87, 1, 24, 4, 9, 54, 37, 26, 19}; 
		int sum = 0;
		double media = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i];
		}
		
		media = (double)sum/arr.length;
		System.out.println("La media è: "+media);
	}

}
