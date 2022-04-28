package activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity2 {
  
    final static String ROOT_URI = "https://petstore.swagger.io/v2/user";

    @Test(priority=1)
    public void addNewUserFromFile() throws IOException {
   
        FileInputStream inputJSON = new FileInputStream("src/test/java/activities/userinfo.json");
   
        String reqBody = new String(inputJSON.readAllBytes());

        Response response = 
            given().contentType(ContentType.JSON) 
            .body(reqBody) 
            .when().post(ROOT_URI); 

        inputJSON.close();

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("9999"));
    }
    
    @Test(priority=2)
    public void getUserInfo() {
        // Import JSON file to write to
        File outputJSON = new File("src/test/java/activities/userGETResponse.json");

        Response response = 
            given().contentType(ContentType.JSON) 
            .pathParam("username", "Dipa") 
            .when().get(ROOT_URI + "/{username}"); 
        
        // Get response body
        String resBody = response.getBody().asPrettyString();

        try {
       
            outputJSON.createNewFile();
     
            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(resBody);
            writer.close();
        } catch (IOException excp) {
            excp.printStackTrace();
        }
        
        // Assertion
        response.then().body("id", equalTo(9999));
        response.then().body("username", equalTo("Dipa"));
        response.then().body("firstName", equalTo("Dipa"));
        response.then().body("lastName", equalTo("Chatt"));
        response.then().body("email", equalTo("dipa@mail.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9812763459"));
    }
    
    @Test(priority=3)
    public void deleteUser() throws IOException {
        Response response = 
            given().contentType(ContentType.JSON)
            .pathParam("username", "Dipa") 
            .when().delete(ROOT_URI + "/{username}"); 

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("Dipa"));
    }
}
