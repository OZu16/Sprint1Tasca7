package n1exercici2;

public class OnlineWorker extends Worker {
	
	final float INTERNET = 40.6f;
	
	public OnlineWorker(String name, String lastName, float priceHour) {
		super(name, lastName, priceHour);
	}
	
	@Override
	public String salariCalculation(float b) {
			
			return super.getName() + " " + super.getLastName() + " " + ((b *= super.getPriceHour()) + INTERNET);
		}
	
	@Deprecated
	public void priceHour() {
		
		 System.out.println(super.getPriceHour());
		
	}

}