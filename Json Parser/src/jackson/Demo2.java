package jackson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo2 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		String carJson =
		        "{ \"brand\" : \"Mercedes\", \"doors\" : 4 }";
		Reader reader = new StringReader(carJson);

		Car car = objectMapper.readValue(reader, Car.class);
		System.out.println(car.getBrand() + ": " + car.getDoors());
	}

}
