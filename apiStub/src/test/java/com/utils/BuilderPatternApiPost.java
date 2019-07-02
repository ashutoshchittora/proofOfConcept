// pre-requisite : api assignements
// Question on assignments
// 1. Builder Pattern - why and where not ( adv , disadv )
// 2. deserialization and serialization using java and C#
// 3. httpclient - post ( convert java to json)
// 4. restassured - get ( convert json to java)
// 5. Stubbing
		// a. Azure webapps
		// b. sandbox - merits and demerits
		// c. aws
		// d. static txt files or static strings
		// e. using json-server
		// f. deploy json-server 'node.js' application to a windows server 
		// g. Postman - merits nad demerits

package com.utils;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import javax.xml.ws.Response;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;

public class BuilderPatternApiPost {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ProductRoot pr = new ProductRoot.Builder().withProductName("nike").withAboutMe("fjkasdfjk").withDeletedDateTime("kskjdfjknhsdfg").build();
		ObjectMapper Obj = new ObjectMapper();
		//postData(pr,Obj);
		
		getData(Obj);
		
	}
	
	public static void postData(ProductRoot pr,ObjectMapper Obj) {
		

        try { 
  
            // get 'ProductRoot'  object as a json string
            String jsonStr = Obj.writeValueAsString(pr); 
  
            // Displaying JSON String 
            System.out.println(jsonStr);
            
            // post data using httpclient
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("https://mockash.getsandbox.com/product");	            
            StringEntity entity = new StringEntity(jsonStr);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");	         
            CloseableHttpResponse response = client.execute(httpPost);  
            
            System.out.println("THE STATUS OF THE POST IS --> "+response.getStatusLine().getStatusCode());
            
            client.close();
        } 
  
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
	}
	
	public static void getData(ObjectMapper Obj) throws JsonParseException, JsonMappingException, IOException {
		// start the json-server locally
				
		// fetch data using RestAssured
		RestAssured.baseURI = "http://localhost:3000/companies";
		
		//RequestSpecification httpRequest = RestAssured.given();
		ResponseBody response = RestAssured.given().get("/100").getBody();
		
		// Retrieve the body of the Response
		//ResponseBody body = response.getBody();
		
		System.out.println("Response Body is: " + response.asString());
		
		
		//convert json string to object
	    GetData getJsonClass = Obj.readValue(response.asString(), GetData.class);
	    System.out.println(getJsonClass.getName());
		
	}

}
