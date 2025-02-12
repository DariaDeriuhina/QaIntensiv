package basic_live_coding_lesson6.homework.api.booker;

import basic_live_coding_lesson6.homework.api.booker.models.Booking;
import basic_live_coding_lesson6.homework.api.booker.services.AuthService;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class BaseApi {
    public static final String BASE_URI = "https://restful-booker.herokuapp.com";
    private String token;

    public BaseApi(){
        token = new AuthService().getToken("admin", "password123", BASE_URI);
    }

    public Response getBookingIds(){
        return when().get(BASE_URI + "/booking");
    }

    public Response getBookingId(int id){
        return given()
                .when()
                .get(BASE_URI + "/booking/" + id);
    }

    public Response updateBookingById(int id, Booking booking){
        return given()
                .contentType("application/json")
                .accept("application/json")
                .cookie("token", token)
                .body(booking)
                .when()
                .put(BASE_URI + "/booking/" + id);
    }

    public Response createBooking(Booking booking) {
        return given()
                .contentType(ContentType.JSON)
                .body(booking)
                .when()
                .post(BASE_URI + "/booking");
    }

    public Response deleteBooking(int bookingId) {
        return given()
                .cookie("token", token)
                .when()
                .delete(BASE_URI + "/booking/" + bookingId);
    }
}
