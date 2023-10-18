package n1exercici1;

public class Worker {

	private String name;
	private String lastName;
	private float priceHour;
	
	
	public Worker(String name, String lastName, float priceHour) {
		this.name = name;
		this.lastName = lastName;
		this.priceHour = priceHour;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public float getPriceHour() {
		return priceHour;
	}


	public void setPriceHour(float priceHour) {
		this.priceHour = priceHour;
	}
	
	
	
	public float salariCalculation(float b) {
		
		return b *= this.priceHour;
	}

	

}