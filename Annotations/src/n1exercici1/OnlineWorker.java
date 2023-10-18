package n1exercici1;

public class OnlineWorker extends Worker {
	
	final float INTERNET = 40.6f;
	
	public OnlineWorker(String name, String lastName, float priceHour) {
		super(name, lastName, priceHour);
	}
	
	@Override
	public float salariCalculation(float b) {
			
			return (b *= super.getPriceHour()) + INTERNET;
		}
	

}