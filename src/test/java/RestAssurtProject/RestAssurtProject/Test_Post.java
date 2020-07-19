package RestAssurtProject.RestAssurtProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import javax.activation.MailcapCommandMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Test_Post {
	@Test
	public void test_1() {
		
	/*Map<String, Object >map=new HashMap<String,Object>();
	map.put("name", "mohan");
	map.put("job", "Teacher");
	System.out.println(map);
	*/
		
	JSONObject request=new 	JSONObject();
	request.put("name","Mohan");
	request.put("job", "Teacher");
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	
	given().
		header("Content-Type","applicaton/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		post("https://reqres.in/api/users").
	then().statusCode(201);
	
		
	}


@Test
public void test_2() {
	

	
	JSONObject request=new 	JSONObject();
	request.put("name","Mohan");
	request.put("job", "Teacher");

	System.out.println(request);
	System.out.println(request.toJSONString());


	given().
		header("Content-Type","applicaton/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		put("https://reqres.in/api/users/2").
	then().statusCode(200).log().all();
	

	}
@Test
public void test_3() {
	

	
	JSONObject request=new 	JSONObject();
	request.put("name","Mohan");
	request.put("job", "Teacher");

	System.out.println(request);
	System.out.println(request.toJSONString());


	given().
		header("Content-Type","applicaton/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		patch("https://reqres.in/api/users/2").
	then().statusCode(200).log().all();
	

	}
@Test
public void test_4() {
	
	when().
		delete("https://reqres.in/api/users/2").
	then().statusCode(204).log().all();
	

	}
	}