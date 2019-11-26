package controllers;

import domain.MealService;
import domain.UserService;
import entity.Meal;
import entity.User;
import entity.algoritm.CountNormManager;
import entity.dao.repository.MealRepository;
import entity.dao.repository.UserRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private UserService userService;
    private MealService mealService;

   public Controller(){

    userService = new UserService();
    mealService = new MealService();

}
    public void menu() {
        char c = '0';
        String name ;
        System.out.println("get all users -1");
        System.out.println("conculate norm -2");
        System.out.println("get all meal - 3");
        System.out.println("get  meal by name  - 3");




        do
        {

            Scanner scanner = new Scanner(System.in);
            c = scanner.next().charAt(0);

            switch (c) {
                case '1': {

                printArrayU(userService.getAllUsers());

                }

                break;


                case '2': {
                    User user = userService.getUserId(4).get(0);
                System.out.println(userService.conculateNorm(user).toString());

                break;
                }
                case '3': {
                        printArrayM(mealService.getAllMeals());
                        break;
                }
                case '4': {
                    name = scanner.next();

                    printArrayM( mealService.getMealByName(name));
                    break;
                }
            }
        }
        while (c != 'q');
    }
    public void printArrayU(ArrayList<User> users){
        for (User u:
                users) {
            System.out.println(u.toString());
        }


    }
    public void printArrayM(ArrayList<Meal> meals){
        for (Meal m:
                meals) {
            System.out.println(m.toString());
        }
    }
}
