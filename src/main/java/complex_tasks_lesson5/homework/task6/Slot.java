package complex_tasks_lesson5.homework.task6;

import java.time.LocalDate;
import java.util.Objects;

public class Slot {
    private boolean isBusy;
    private LocalDate date;
    private int time;

    public Slot(LocalDate date, int time) {
        this.isBusy = false;
        this.date = date;
        this.time = time;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "isBusy=" + isBusy +
                ", date=" + date +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slot slot = (Slot) o;
        return  time == slot.time && date.equals(slot.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time);
    }
}
