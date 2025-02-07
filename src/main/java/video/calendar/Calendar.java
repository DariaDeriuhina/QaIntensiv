package video.calendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calendar {
    private List<Slot> slots;
    private Month month;

    public Calendar(Month month){
        slots = new ArrayList<>();
        this.month = month;
        createSlots();
    }

    private void createSlots(){
        int month2 = month.getValue();
        int year = LocalDate.now().getYear();
        int days = month.length(LocalDate.now().isLeapYear());

        for(int i = 1; i<=days; i++){
            for(int j = 9; j<= 17; j++)
            slots.add(new Slot(LocalDate.of(year, month2, i), j));
        }
    }

    public List<Slot> showEmptySlots(){
        return slots.stream().filter(el -> !el.isBooked()).collect(Collectors.toList());
    }

    public void bookSlot(Slot slot){
        int index = slots.indexOf(slot);
        if(index==-1){
            System.out.println("No such element in collection");
            return;
        } else {
            if(slots.get(index).isBooked()){
                throw new IllegalArgumentException("Your slot is already booked");
            } else {
                slots.get(index).bookSlot();
            }
        }
    }

    public void unbookSlot(Slot slot){
        int index = slots.indexOf(slot);
        if(index==-1){
            System.out.println("No such element in collection");
            return;
        } else {
            if(!slots.get(index).isBooked()){
                throw new IllegalArgumentException("Your slot is unbooked");
            } else {
                slots.get(index).unbookSlot();
            }
        }
    }

    public long showCountOfAvailableHours(){
        return slots.stream().filter(el -> !el.isBooked()).count();
    }



}
