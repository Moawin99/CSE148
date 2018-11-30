package jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo9 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String jsonArray = "[{\"brand\": \"Toyota\",\"doors\": 8, \"owner\":\"Joe\"},{\"brand\": \"Honda\",\"doors\": 3, \"owner\":\"Alan\"}]";

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Car[] cars2 = objectMapper.readValue(jsonArray, Car[].class);
		for (int i = 0; i < cars2.length; i++) {
			System.out.println(cars2[i].getBrand() + ": " + cars2[i].getDoors());
		}
	}
}
