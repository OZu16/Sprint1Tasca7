package n1exercici2;


public class MainClass {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		float hoursPerMonth = 160f;
		
		Worker a = new Worker("Joel", "Bellecosta", 14.5f);
		OnlineWorker b = new OnlineWorker("Aitor", "Penedas", 16.2f);
		FaceToFaceWorker c = new FaceToFaceWorker("Joao", "Martorell", 16.0f);
		
		System.out.println(a.salariCalculation(hoursPerMonth));
		System.out.println(b.salariCalculation(hoursPerMonth));
		System.out.println(c.salariCalculation(hoursPerMonth));
		
		
		b.priceHour();
		System.out.println(c.getBenzina());
		
	}
}
