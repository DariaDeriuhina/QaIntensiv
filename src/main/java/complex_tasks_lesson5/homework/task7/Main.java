package complex_tasks_lesson5.homework.task7;

public class Main {
    public static void main(String[] args) {
        CaloryApp caloryApp = new CaloryApp();
        Dish dish = new Dish("Fish", 100);
        Dish dish2 = new Dish("Meat", 200);
        Dish dish3 = new Dish("Apple", 10);

        caloryApp.addDishesToDay(1, dish);
        caloryApp.addDishesToDay(1, dish2);
        caloryApp.addDishesToDay(2, dish3);

        System.out.println(caloryApp.showAvgCalories());
        caloryApp.showDishesAndCaloriesForDay(1);
        caloryApp.showDishesAndCaloriesForDay(2);
    }
}
