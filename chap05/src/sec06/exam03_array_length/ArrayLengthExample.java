package sec06.exam03_array_length;
//πËø≠¿« ±Ê¿Ã

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 50, 90 };
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("√—«’ : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("∆Ú±’ : " + avg);
	}
}
