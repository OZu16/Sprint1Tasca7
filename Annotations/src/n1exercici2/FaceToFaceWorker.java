package n1exercici2;

public class FaceToFaceWorker extends Worker {
	
	static float benzina = 50.5f;
	
	public FaceToFaceWorker(String name, String lastName, float priceHour) {
		super(name, lastName, priceHour);
	}
	
	@Override
	public String salariCalculation(float b) {
		
		return super.getName() + " " + super.getLastName() + " " + ((b *= super.getPriceHour()) + benzina);
	}
	
	@Deprecated
	public float getBenzina() {
		
		 return benzina;
		
	}
}