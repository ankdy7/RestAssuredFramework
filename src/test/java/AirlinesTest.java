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
				Payloads.createAirlinePayloadFromMap("21321312121231", "ABCderasd Airlines", "IN", "ABC", 
						"ABC Slogan", "Mumbai", "abc.com", "2022");
		
		Response  response = RestUtils.performPost(endPoint, requestPayload, new HashMap<String, String>());
		
		Assert.assertEquals(response.statusCode(), 200);
		
		System.out.println(response.asPrettyString());
	}
}
