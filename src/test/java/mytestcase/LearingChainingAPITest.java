package mytestcase;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class LearingChainingAPITest {
	
	String id = "";
	
	@Test(priority = 1)
	public void testCreateCoursesUsingExternalFile() throws FileNotFoundException {
		
		File file = new File("C:\\Users\\SHAMBHU\\Downloads\\OnlineStoreFakeRestAPI\\OnlineStoreFakeRestAPI\\src\\test\\java\\mytestcase\\course.json");
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject requestBody = new JSONObject(jsonTokener);
		
		id = given()
			.header("Content-Type", "application/json")
			.body(requestBody.toString())
		.when()
			.post("https://lebyy.com/practice/api/courses")
		.then() 
			.statusCode(201)
			.log().body()
			.extract().jsonPath().getString("id");
			System.out.println(id);
		
		
	}
	
	@Test(priority = 2)
	public void testGetCoursesById() {
		
		System.out.println(id);
		
		given()
			.pathParam("id", id)
		.when()
			.get("https://lebyy.com/practice/api/courses/{id}")
		.then() 
			.log().body()
			.statusCode(200);
		
	}
	
	@Test(priority = 3)
	public void testGetAllCourses() {
		
		given()
			
		.when()
			.get("https://lebyy.com/practice/api/courses")
		.then() 
			.log().body()
			.statusCode(200);
		
	}
	
	@Test(priority = 4)
	public void testPatchCoursesUsingHashMap() {
		
		System.out.println(id);
		
		HashMap<String, Object> requestBody = new HashMap<>();
		
		requestBody.put("price", 200.87);
		requestBody.put("active", true);
		
		given()
			.header("Content-Type", "application/json")
			.pathParam("id", id)
			.body(requestBody)
		.when()
			.patch("https://lebyy.com/practice/api/courses/{id}")
		.then() 
			.log().body()
			.statusCode(200);
		
	}
	
	@Test(priority = 5)
	public void testDeleteCoursesById() {
		
		System.out.println(id);
		
		given()
			.pathParam("id", id)
		.when()
			.delete("https://lebyy.com/practice/api/courses/{id}")
		.then() 
			.log().body()
			.statusCode(200);
		
	}
	
	@Test(priority = 6)
	public void testGetAllCoursesAfterDelete() {
		
		given()
			
		.when()
			.get("https://lebyy.com/practice/api/courses")
		.then() 
			.log().body()
			.statusCode(200);
		
	}
	
	

}
