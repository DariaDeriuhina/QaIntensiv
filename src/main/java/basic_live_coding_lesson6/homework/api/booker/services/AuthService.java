package basic_live_coding_lesson6.homework.api.booker.services;

import basic_live_coding_lesson6.homework.api.booker.models.AuthRequest;
import io.restassured.RestAssured;

import static io.restassured.http.ContentType.JSON;

public class AuthService {

    public String getToken(String name, String password, String url){
        AuthRequest authRequest = new AuthRequest(name, password);
        return RestAssured.given().contentType(JSON).body(authRequest)
                .when()
                .post(url + "/auth")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .path("token");
    }
}
