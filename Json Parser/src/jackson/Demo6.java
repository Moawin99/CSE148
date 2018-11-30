package jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo6 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String jsonArray = "[{\"brand\":\"Ford\", \"doors\":3}, {\"brand\":\"Fiat\", \"doors\":7}]";

		ObjectMapper objectMapper = new ObjectMapper();

		Car[] cars2 = objectMapper.readValue(jsonArray, Car[].class);
		for (int i =0; i < cars2.length; i++) {
			System.out.println(cars2[i].getBrand() + ": " + cars2[i].getDoors());
		}
	}

}
