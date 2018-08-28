package ua.kiev.prog;

public interface FoodService {
    Food getFoodById(long id);
    void addFood(Food food);
    void updateFood(Food food);
}

