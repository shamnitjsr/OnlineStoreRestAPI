package mytestcase;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;



public class LearningTest {
	
//	@Test(priority = 1)
//	public void testGetAllCourses() {
//		
//		given()
//			
//		.when()
//			.get("https://lebyy.com/practice/api/courses")
//		.then() 
//			.log().body()
//			.statusCode(200);
//		
//	}
//	
//	@Test(priority = 2)
//	public void testGetCoursesById() {
//		
//		given()
//			.pathParam("id", 13)
//		.when()
//			.get("https://lebyy.com/practice/api/courses/{id}")
//		.then() 
//			.log().body()
//			.statusCode(200);
//		
//	}
	
//	@Test(priority = 1)
//	public void testCreateCoursesUsingHashMap() {
//		
//		HashMap<String, Object> requestBody = new HashMap<>();
//		requestBody.put("title","Machine Learning");
//		requestBody.put("category","AI Learning");
//		requestBody.put("level", "Advanced");
//		requestBody.put("price", 160.90);
//		requestBody.put("language", "English");
//		requestBody.put("active", true);
//		
//		given()
//			.header("Content-Type", "application/json")
//			.body(requestBody)
//		.when()
//			.post("https://lebyy.com/practice/api/courses")
//		.then() 
//			.log().body()
//			.statusCode(201);
//		
//	}
	
//	@Test(priority = 1)
//	public void testCreateCoursesUsingJsonLibrary() {
//		
//		JSONObject requestBody = new JSONObject();
//		requestBody.put("title","Space Technology");
//		requestBody.put("category","AI Learning");
//		requestBody.put("level", "Advanced");
//		requestBody.put("price", 500.90);
//		requestBody.put("language", "English");
//		requestBody.put("active", true);
//		
//		String id = given()
//			.header("Content-Type", "application/json")
//			.body(requestBody.toString())
//		.when()
//			.post("https://lebyy.com/practice/api/courses")
//		.then() 
//			.statusCode(201)
//			.log().body()
//			.extract().jsonPath().getString("id");
//			System.out.println(id);
//		
//	}
	
//	@Test(priority = 1)
//	public void testCreateCoursesUsingPOJO() {
//		
//		CoursePOJO requestBody = new CoursePOJO();
//		requestBody.setTitle("Physics");
//		requestBody.setCategory("AI Learning");
//		requestBody.setLevel("Advanced");
//		requestBody.setPrice(400.90);
//		requestBody.setLanguage("English");
//		requestBody.setActive(true);
//		
//		String id = given()
//			.header("Content-Type", "application/json")
//			.body(requestBody)
//		.when()
//			.post("https://lebyy.com/practice/api/courses")
//		.then() 
//			.statusCode(201)
//			.log().body()
//			.extract().jsonPath().getString("id");
//			System.out.println(id);
//		
//	}
	
//	@Test(priority = 1)
//	public void testCreateCoursesUsingExternalFile() throws FileNotFoundException {
//		
//		File file = new File("C:\\Users\\SHAMBHU\\Downloads\\OnlineStoreFakeRestAPI\\OnlineStoreFakeRestAPI\\src\\test\\java\\mytestcase\\course.json");
//		FileReader fileReader = new FileReader(file);
//		JSONTokener jsonTokener = new JSONTokener(fileReader);
//		JSONObject requestBody = new JSONObject(jsonTokener);
//		
//		String id = given()
//			.header("Content-Type", "application/json")
//			.body(requestBody.toString())
//		.when()
//			.post("https://lebyy.com/practice/api/courses")
//		.then() 
//			.statusCode(201)
//			.log().body()
//			.extract().jsonPath().getString("id");
//			System.out.println(id);
//		
//	}
	
	
//	@Test(priority = 1)
//	public void testUpdateCoursesUsingExternalFile() throws FileNotFoundException {
//		
//		File file = new File("C:\\Users\\SHAMBHU\\Downloads\\OnlineStoreFakeRestAPI\\OnlineStoreFakeRestAPI\\src\\test\\java\\mytestcase\\course.json");
//		FileReader fileReader = new FileReader(file);
//		JSONTokener jsonTokener = new JSONTokener(fileReader);
//		JSONObject requestBody = new JSONObject(jsonTokener);
//		
//		String id = given()
//			.header("Content-Type", "application/json")
//			.pathParam("id", 13)
//			.body(requestBody.toString())
//		.when()
//			.put("https://lebyy.com/practice/api/courses/{id}")
//		.then() 
//			.statusCode(200)
//			.log().body()
//			.extract().jsonPath().getString("id");
//			System.out.println(id);
//		
//	}
	
	
//	@Test(priority = 1)
//	public void testPatchCoursesUsingHashMap() {
//		
//		HashMap<String, Object> requestBody = new HashMap<>();
//		
//		requestBody.put("price", 200.87);
//		requestBody.put("active", true);
//		
//		given()
//			.header("Content-Type", "application/json")
//			.pathParam("id", 13)
//			.body(requestBody)
//		.when()
//			.patch("https://lebyy.com/practice/api/courses/{id}")
//		.then() 
//			.log().body()
//			.statusCode(200);
//		
//	}
	
	@Test(priority = 2)
	public void testDeleteCoursesById() {
		
		given()
			.pathParam("id", 9)
		.when()
			.delete("https://lebyy.com/practice/api/courses/{id}")
		.then() 
			.log().body()
			.statusCode(200);
		
	}

}
