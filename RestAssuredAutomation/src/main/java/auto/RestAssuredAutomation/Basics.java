
package auto.RestAssuredAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.sun.org.apache.xpath.internal.operations.And;

public class Basics { 

	// BAseUri or host - AIzaSyDaBwGzVkOHoTPIJphx2hirBhaiBFTjscw  (Place Search)
	//https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=Museum%20of%20Contemporary%20Art%20Australia&inputtype=textquery&fields=photos,formatted_address,name,rating,opening_hours,geometry&key=YOUR_API_KEY

	/*
	 * given() - here need to provide Request - headers/cookies/parameters/body
	 * when() - hit the URL with resource then() - assertions on response extract()
	 * - save response in variable
	 */

	/*
	 * RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 * RequestSpecification httpRequest = RestAssured.given(); Response response =
	 * httpRequest.request(Method.GET, "/Hyderabad"); String responseBody =
	 * response.getBody().asString(); System.out.println("Response Body is =>  " +
	 * responseBody);
	 */

	@Test
	public void testStatus200() {
		RestAssured.baseURI = "http://216.10.245.166";
		given().param("location", "-38.383494,33.427362").param("radius", "50").param("key", "qaclick123").
		when().get("maps/api/place/add/json").
		then().assertThat().statusCode(200);
	}
	
	@Test
	public void testResponseContentType() {
		RestAssured.baseURI = "http://216.10.245.166";
		given().param("location", "-38.383494,33.427362").param("radius", "50").param("key", "qaclick123").
		when().get("maps/api/place/add/json").
		then().assertThat().contentType(ContentType.JSON);
	}

}
