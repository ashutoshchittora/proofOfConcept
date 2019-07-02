// pre-requisite : api assignements
// Question on assignments
// 1. Builder Pattern
// 2. deserialization
// 3. serialization
// 4. httpclient - post ( convert java to json)
// 5. restassured - get ( convert json to java)
// 6. Stubbing
		// a. Azure webapps
		// b. sandbox
		// c. aws
		// d. static txt files or static strings
		// e. using json-server
		// f. deploy json-server 'node.js' application to a windows server 

package com.utils;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BuilderPatternApiPost {

	public static void main(String[] args) {

		ProductRoot pr = new ProductRoot.Builder().withProductName("nike").withAboutMe("fjkasdfjk").withDeletedDateTime("kskjdfjknhsdfg").build();
		postData(pr);
		
	}
	
	public static void postData(ProductRoot pr) {
		ObjectMapper Obj = new ObjectMapper();

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
	
	public static void getData() {
		
	}

}
