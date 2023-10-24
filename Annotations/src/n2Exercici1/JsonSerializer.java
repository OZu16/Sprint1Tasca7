package n2Exercici1;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class JsonSerializer {
	
	public static void serializeToJson(Object obj) {
		
        Class<?> clase = obj.getClass();
        
        String directory = clase.getAnnotation(JsonAnnotation.class).directory();
        
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        
        String fileName = directory + "/" + clase.getSimpleName() + ".json";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
            System.out.println(obj + " serialitzat");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}	