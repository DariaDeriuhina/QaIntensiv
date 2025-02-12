package basic_live_coding_lesson6.homework.api.booker.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class BookingDates {
    private String checkin;
    private String checkout;
}
