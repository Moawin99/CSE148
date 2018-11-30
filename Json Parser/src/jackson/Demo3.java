package jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo3 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("data/car.json");

		Car car = objectMapper.readValue(file, Car.class);
		System.out.println(car.getBrand() + ": " + car.getDoors());
	}

}
