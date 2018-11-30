package jackson;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo4 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		URL url = new URL("file:data/car.json");

		Car car = objectMapper.readValue(url, Car.class);
		System.out.println(car.getBrand() + ": " + car.getDoors());
		
	}

}
