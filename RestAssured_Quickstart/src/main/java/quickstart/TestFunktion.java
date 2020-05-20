package quickstart;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.restassured.http.ContentType;


public class TestFunktion {
	@Test
	public void getAllEmployees() {
		baseURI = "https://jsonplaceholder.typicode.com";
		given().when().
		get("/todos").
		then().log().body();
	}
	
	@Test 
	public void getEmployeeById() {
		baseURI = "https://jsonplaceholder.typicode.com";
		given().when().
		get("/todos/1").
		then().assertThat().statusCode(200).log().body();
	}
	
	@Test 
	public void createEmployee() {
		baseURI = "https://jsonplaceholder.typicode.com";
		given().params("userId","1","id","100","title","servus","completed","true").
		when().
		post("/todos").
		then().log().body();
	}
	
	@Test
	public void updateEmployee() {
		baseURI = "https://jsonplaceholder.typicode.com";
		given().params("name","test","salary","500","age","64").
		when().
		put("/todos").
		then().assertThat().statusCode(200).
		log().body();

	}

}
