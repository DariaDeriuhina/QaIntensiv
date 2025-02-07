package video.calendar;

import java.time.LocalDate;
import java.util.Objects;

public class Slot {
    private final LocalDate date;
    private final int timeSlot;
    private boolean isBooked;

    public Slot(LocalDate date, int timeSlot) {
        this.date = date;
        this.timeSlot = timeSlot;
        isBooked = false;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookSlot(){
        isBooked = true;
    }

    public void unbookSlot(){
        isBooked = false;
    }

    @Override
    public String toString() {
        return "Slot with date= " + date +
                " timeSlot=" + timeSlot +
                " isBooked=" + isBooked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slot slot = (Slot) o;
        return timeSlot == slot.timeSlot && Objects.equals(date, slot.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, timeSlot);
    }
}
