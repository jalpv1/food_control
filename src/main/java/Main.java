import entity.Meal;
import entity.User;
import entity.dao.repository.MealRepository;
import entity.dao.repository.UserRepository;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        MealRepository mealRepository  = new MealRepository();
        ArrayList<Meal> meals =mealRepository.getMeal();
        for (Meal m:
            meals ) {
            System.out.println(m.toString());
        }
        ArrayList<User> users =userRepository.getUser();
        for (User u:
             users) {
        System.out.println(u.toString());
            }

        System.out.println("Hello World!");

    }

}
