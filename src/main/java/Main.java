import controllers.Controller;
import entity.Meal;
import entity.User;
import entity.algoritm.CountNormManager;
import entity.dao.repository.MealRepository;
import entity.dao.repository.UserRepository;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     /*   UserRepository userRepository = new UserRepository();
        MealRepository mealRepository  = new MealRepository();
        ArrayList<Meal> meals =mealRepository.getMeal();
        ArrayList<Meal> mealsName =mealRepository.getMealByName("pizza");
        CountNormManager countNormManager = new CountNormManager();

        for (Meal m:
            meals ) {
            System.out.println(m.toString());
        }
        ArrayList<User> users =userRepository.getUser();
        for (User u:
             users) {
        System.out.println(u.toString());
            }

        for (Meal m:
                mealsName ) {
            System.out.println(m.toString());
        }
      User user =  countNormManager.conculateNorm(users.get(0));
        System.out.println(user.toString());
        System.out.println("Hello World!");

      */
        Controller controller = new Controller();
        controller.menu();

    }

}
