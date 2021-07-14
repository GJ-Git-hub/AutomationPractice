package RestAssured;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;

public class PostCall {
    public static void main(String[] args) {

        //Payload for body
        JSONObject request = new JSONObject();
        request.put("name","Jaynat kale");
        request.put("job","Data");

        Response resp = RestAssured.
                given()
                .contentType("application/json")
                .body(request.toJSONString())
                .when().post("https://reqres.in/api/users");



        JsonPath path = new JsonPath(resp.asString());
        resp.prettyPrint();
        Assert.assertEquals(resp.statusCode(),201);
        Assert.assertEquals(path.get("name"),"Jaynat kale");

    }
}
