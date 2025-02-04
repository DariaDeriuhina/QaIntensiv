package complex_tasks_lesson5.homework.task7;

import java.util.*;

public class CaloryApp {
    private Map<Integer, List<Dish>> map;

    public CaloryApp(){
        map = new HashMap<>();
    }

    public void addDishesToDay(int day, Dish dish){
        map.putIfAbsent(day, new ArrayList<>());
        map.get(day).add(dish);
    }

    public void removeDishesFromDay(int day, Dish dish){
        List<Dish> dishes = map.get(day);
        if (dishes == null) {
            throw new IllegalArgumentException("No such day in the system");
        }
        if (!dishes.remove(dish)) {
            throw new IllegalArgumentException("There is no such dish in the day " + day);
        }
        if (dishes.isEmpty()) {
            map.remove(day);
        }
    }

    public void showDishesAndCaloriesForDay(int day){
        List<Dish> dishes = map.get(day);
        if (dishes == null || dishes.isEmpty()) {
            System.out.println("No dishes recorded for day " + day);
            return;
        }
        dishes.forEach(dish -> System.out.print(dish.getName() + " "));
        System.out.println("\nOverall calories: " + dishes.stream().mapToInt(Dish::getCalories).sum());
    }

    public double showAvgCalories(){
        if (map.isEmpty()) return 0;
        int sum = 0;

        for(Map.Entry<Integer, List<Dish>> entry : map.entrySet()){
            List<Dish> dishes =  entry.getValue();
            sum += dishes.stream().mapToInt(Dish::getCalories).sum();

        }

        return Math.round((double) sum/map.size());
    }
}
