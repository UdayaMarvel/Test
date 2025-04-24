package com.petstore;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class PetStore {
public static void main(String[] args) {
	
	System.out.println("start");
	RestAssured.baseURI = "https://petstore.swagger.io/v2";
	
	//given -  headers and parameters
	//when - method and end point
	//then	- status code validation
	given().log().all().headers("Content-Type","application/json").
	body("{\r\n"
			+ "  \"id\": 1010102,\r\n"
			+ "  \"category\": {\r\n"
			+ "    \"id\": 2,\r\n"
			+ "    \"name\": \"Dog\"\r\n"
			+ "  },\r\n"
			+ "  \"name\": \"Scooby\",\r\n"
			+ "  \"photoUrls\": [\r\n"
			+ "    \"string\"\r\n"
			+ "  ],\r\n"
			+ "  \"tags\": [\r\n"
			+ "    {\r\n"
			+ "      \"id\": 12,\r\n"
			+ "      \"name\": \"Good\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"status\": \"available\"\r\n"
			+ "}").
	when().post("/pet").
	then().log().all().assertThat().statusCode(200);
	
//	JsonPath js = new JsonPath(response);
//	int num = js.get("id");
//	int categoryID = js.get("tags[0].id");
//	System.out.println(num);
//	System.out.println(categoryID);
	
//	given().headers("content-type","application/json").queryParam("status", "available").
//	when().get("/pet/findByStatus").
//	then().log().all().assertThat().statusCode(200);
	
}
}
