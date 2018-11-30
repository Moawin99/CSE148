package jackson;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo7 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String jsonArray = "[{\"brand\":\"ford\", \"doors\":1}, {\"brand\":\"Fiat\", \"doors\":5}]";

		ObjectMapper objectMapper = new ObjectMapper();

		List<Car> cars1 = objectMapper.readValue(jsonArray, new TypeReference<List<Car>>() {
		});

		System.out.println(cars1.toString());

	}

}
