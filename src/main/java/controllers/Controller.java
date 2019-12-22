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

    public Controller() {

        userService = new UserService();
        mealService = new MealService();

    }

    public void menu() {
        char c = '9';
        String name;
        System.out.println("new user -0");

        System.out.println("get all users -1");
        System.out.println("conculate norm -2");
        System.out.println("get all meal - 3");
        System.out.println("get  meal by name  - 4");
        System.out.println("add meal - 4");


        String nameMeal;
        String type;
        int amoumdFats;
        int carbones;
        int proteins;
        int kkals;


        do {

            Scanner scanner = new Scanner(System.in);
            c = scanner.next().charAt(0);

            switch (c) {
                case '0': {
                    User user = new User();

                    System.out.println("Enter login");

                    user.setLogin(scanner.next());
                    System.out.println("Enter password");

                    user.setPassword(scanner.next());
                    System.out.println("Enter your sex f or m");

                    user.setSex(scanner.next());
                    System.out.println("Enter weigh");

                    user.setWeight(Integer.parseInt(scanner.next()));
                    System.out.println("Enter activity level");

                    user.setActivityLevel(Integer.parseInt(scanner.next()));
                    userService.addUser(user);


                    break;

                }
                case '1': {

                    printArrayU(userService.getAllUsers());


                    break;

                }
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

                    printArrayM(mealService.getMealByName(name));
                    break;
                }
                case '5': {
                    System.out.println("Enter name of meal");

                    nameMeal = scanner.next();
                    System.out.println("Enter type of meal");

                    type = scanner.next();
                    System.out.println("Enter fats of meal");

                    amoumdFats = Integer.parseInt(scanner.next());
                    System.out.println("Enter carbones of meal");

                    carbones = Integer.parseInt(scanner.next());

                    System.out.println("Enter proteins of meal");

                    proteins = Integer.parseInt(scanner.next());
                    System.out.println("Enter kkal of meal");

                    kkals = Integer.parseInt(scanner.next());
                    mealService.addMeal(nameMeal, type, kkals, carbones, proteins, amoumdFats);
                    break;

                }
            }
        }
        while (c != 'q');
    }

    public void printArrayU(ArrayList<User> users) {
        for (User u :
                users) {
            System.out.println(u.toString());
        }


    }

    public void printArrayM(ArrayList<Meal> meals) {
        for (Meal m :
                meals) {
            System.out.println(m.toString());
        }
    }
}
