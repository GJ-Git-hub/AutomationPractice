package RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetCall {


       public void getRequest() {

        Response response = RestAssured.
                given().queryParam("page", "2")
                .when()
                .get("https://reqres.in/api/users");

        JsonPath path = new JsonPath(response.asString());
        Assert.assertEquals(path.get("total"), 12);
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);
    }


}
