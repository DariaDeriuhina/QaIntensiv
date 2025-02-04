package complex_tasks_lesson5.homework.task7;

public class Dish {
    private final String name;
    private final int calories;

    public Dish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Dish " + name + " with calories " + calories;
    }
}
