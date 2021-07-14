package RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    public static void main(String[] args) {
        RequestSpecBuilder requestspec = new RequestSpecBuilder();
        requestspec.setBaseUri("WWW.gmail.com")
              /*  .addHeader()
                .setAccept()
                .setBody("")*/
                .setRelaxedHTTPSValidation();

        RequestSpecification spec = requestspec.build();

    }
}
