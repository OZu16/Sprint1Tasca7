package n2Exercici1;

@JsonAnnotation
public class SerializableClass {

	String attribute1 = "";
	String attribute2 = "";
	
	
	public SerializableClass(String attribute1, String attribute2) {
		super();
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
	}


	@Override
	public String toString() {
		return "SerilizableClass [attribute1=" + attribute1 + ", attribute2=" + attribute2 + "]";
	}
	
	
	
	
}