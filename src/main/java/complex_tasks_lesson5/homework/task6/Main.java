package complex_tasks_lesson5.homework.task6;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        BookingCalendar bookingCalendar = new BookingCalendar(Month.JANUARY);
        System.out.println(bookingCalendar.showAvailableSlotes());
        Slot slot = new Slot(LocalDate.of(2025, 1,1), 12);

        bookingCalendar.bookSlote(slot);
        System.out.println(bookingCalendar.showUnavailableSlotes());
        System.out.println(bookingCalendar.showNumberOfAvailableHours());
        bookingCalendar.unbookSlote(slot);
        System.out.println(bookingCalendar.showUnavailableSlotes());
        System.out.println(bookingCalendar.showNumberOfAvailableHours());
    }

}
