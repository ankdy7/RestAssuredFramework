package utils;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestUtils {

	public static Response performPost(String endPoint, String requestPayload, Map<String, String> headers) {

		Response response = given().baseUri(endPoint).contentType(ContentType.JSON).headers(headers)
				.body(requestPayload).when().post().then().extract().response();

		return response;
	}
	
	public static Response performPost(String endPoint, Map<String, Object> requestPayload, Map<String, String> headers) {

		Response response = given().baseUri(endPoint).contentType(ContentType.JSON).headers(headers)
				.body(requestPayload).when().post().then().extract().response();

		return response;
	}

}
