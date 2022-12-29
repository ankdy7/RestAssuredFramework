import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import utils.RestUtils;

public class AirlinesTest {

	@Test
	void createAirlines() {

		String endPoint = "https://api.instantwebtools.net/v1/airlines";
		Map<String, Object> requestPayload =  
<<<<<<< HEAD
				Payloads.createAirlinePayloadFromMap("21321312121231", "ABCderasd Airlines", "IN", "ABC", 
						"ABC Slogan", "Mumbai", "abc.com", "20443");
=======
				Payloads.createAirlinePayloadFromMap("213245", "ABCderasd Airlines", "IN", "ABC", 
						"ABC Slogan", "Mumbai", "abc.com", "2022");
>>>>>>> 67681652af7fdfb4b23eae663aecb4dd7cc9d7b8
		
		Response  response = RestUtils.performPost(endPoint, requestPayload, new HashMap<String, String>());
		
		Assert.assertEquals(response.statusCode(), 201);
		
		System.out.println(response.asPrettyString());
	}
}
