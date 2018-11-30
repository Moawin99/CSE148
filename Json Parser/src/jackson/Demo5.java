package jackson;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo5 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		String carJson =
		        "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		byte[] bytes = carJson.getBytes("UTF-8");

		Car car = objectMapper.readValue(bytes, Car.class);
		System.out.println(car.getBrand() + ": " + car.getDoors());	}

}
