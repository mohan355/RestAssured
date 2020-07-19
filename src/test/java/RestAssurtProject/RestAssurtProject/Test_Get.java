package RestAssurtProject.RestAssurtProject;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class Test_Get {
	
	@Test
	public void test_1() {
		
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			
			body("data.id[1]", equalTo(8));
			
			
	}

}
