package n1exercici1;

public class FaceToFaceWorker extends Worker {
	
	static float benzina = 50.5f;
	
	public FaceToFaceWorker(String name, String lastName, float priceHour) {
		super(name, lastName, priceHour);
	}
	
	@Override
	public float salariCalculation(float b) {
		
		return (b *= super.getPriceHour()) + benzina;
	}
	
}