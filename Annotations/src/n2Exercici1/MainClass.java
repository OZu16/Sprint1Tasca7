package n2Exercici1;

public class MainClass {

	public static void main(String[] args) {
	
		SerializableClass sClass = new SerializableClass("a1", "a2");
		
		JsonSerializer.serializeToJson(sClass);
	}

}
