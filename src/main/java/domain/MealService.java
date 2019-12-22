package domain;

import entity.Meal;
import entity.User;
import entity.dao.repository.MealRepository;
import entity.dao.repository.UserRepository;

import java.util.ArrayList;

public class MealService {
    private MealRepository mealRepository;


    public MealService() {
        mealRepository = new MealRepository();
    }

    public ArrayList<Meal> getAllMeals() {
        return mealRepository.getMeal();
    }

    public ArrayList<Meal> getMealByName(String name) {
        return mealRepository.getMealByName(name);
    }

    public void addMeal(String name, String type, int amoundOfKkal,
                        int amoundOfCarbonHydrates, int amoundOfProteins, int amoundOfFats) {
        mealRepository.addMeal(name, type, amoundOfKkal,
                amoundOfCarbonHydrates, amoundOfProteins, amoundOfFats);
    }
    public void addMealToOwnList(Meal meal){

    }


}
