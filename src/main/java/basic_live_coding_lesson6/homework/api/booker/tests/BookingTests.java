package basic_live_coding_lesson6.homework.api.booker.tests;

import basic_live_coding_lesson6.homework.api.booker.BaseApi;
import basic_live_coding_lesson6.homework.api.booker.models.Booking;
import basic_live_coding_lesson6.homework.api.booker.models.BookingDates;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookingTests {

    BaseApi baseApi = new BaseApi();
    Booking booking;
    int id;

    @BeforeClass
    public void setup(){
        BookingDates bookingDates = new BookingDates("2018-01-01", "2019-01-01");
        booking = new Booking("Jim", "Brown", 111, true,
                bookingDates, "Breakfast");
        Response response = baseApi.createBooking(booking);
        Assert.assertEquals(response.getStatusCode(), 200);
        int createdBookingId = response.jsonPath().get("bookingid");
        Assert.assertNotNull(createdBookingId);
        id = createdBookingId;
    }

    @Test
    public void testGetBooking() {
        Response response = baseApi.getBookingId(id);
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("firstname"), "Jim");
    }

    @Test
    public void updateBooking(){
        booking.setFirstname("Egor");
        Response response = baseApi.updateBookingById(id, booking);
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("firstname"), "Egor");
    }

    @AfterClass
    public void deleteCreatedBooking(){
        Response response = baseApi.deleteBooking(id);
        Assert.assertEquals(response.getStatusCode(), 201);
    }
}
