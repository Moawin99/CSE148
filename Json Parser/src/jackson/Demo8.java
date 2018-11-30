package jackson;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo8 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String jsonObject = "{\"brand\":\"ford\", \"doors\":5}";

		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> jsonMap = objectMapper.readValue(jsonObject,
		    new TypeReference<Map<String,Object>>(){});
		System.out.println(jsonMap.get("brand"));
		System.out.println(jsonMap.get("doors"));
	}

}
