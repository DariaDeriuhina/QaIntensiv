package video.calendar;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(Month.JANUARY);

        Slot slot = new Slot(LocalDate.of(2025, 1, 3), 14);
        System.out.println(calendar.showCountOfAvailableHours());
        System.out.println(calendar.showEmptySlots());
        calendar.bookSlot(slot);
        System.out.println(calendar.showCountOfAvailableHours());
        System.out.println(calendar.showEmptySlots());
        calendar.unbookSlot(slot);
        System.out.println(calendar.showCountOfAvailableHours());
    }
}
