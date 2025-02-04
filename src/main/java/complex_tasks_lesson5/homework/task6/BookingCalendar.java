package complex_tasks_lesson5.homework.task6;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookingCalendar {
    private List<Slot> slots;

    public BookingCalendar(Month month) {
        slots = new ArrayList<>();
        addSlotesAccordingToMonth(month);
    }

    private void addSlotesAccordingToMonth(Month month) {
        Slot slot;
        int year = LocalDate.now().getYear();
        int daysInMonth = month.length(LocalDate.now().isLeapYear());

        for (int i = 1; i <= daysInMonth; i++) {
            for (int j = 9; j <= 17; j++) {
                slot = new Slot(LocalDate.of(year, month, i), j);
                slots.add(slot);
            }
        }
    }

    public List<Slot> showAvailableSlotes() {
        return slots.stream().filter(el -> !el.isBusy()).collect(Collectors.toList());
    }

    public List<Slot> showUnavailableSlotes() {
        return slots.stream().filter(Slot::isBusy).collect(Collectors.toList());
    }

    public void bookSlote(Slot slot) {
        int index = slots.indexOf(slot);
        if (index == -1) {
            throw new IllegalArgumentException("Invalid Slot");
        } else {
            if (!slots.get(index).isBusy()) {
                slots.get(index).setBusy(true);
            } else {
                System.out.println("This slot is already booked");
            }
        }
    }

    public void unbookSlote(Slot slot) {
        if (slots.contains(slot)) {

            int index = slots.indexOf(slot);
            if (slots.get(index).isBusy()) {
                slots.get(index).setBusy(false);
            } else {
                System.out.println("This slot was not booked");
            }
        } else {
            throw new IllegalArgumentException("Invalid Slot");
        }
    }

    public int showNumberOfAvailableHours() {
        int counter = 0;
        for (Slot slot : slots) {
            if (!slot.isBusy()) {
                counter++;
            }
        }

        return counter;
    }
}
