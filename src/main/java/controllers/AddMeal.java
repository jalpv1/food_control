package controllers;

import domain.MealService;
import domain.UserService;
import entity.Meal;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

public class AddMeal implements Command {

    private MealService mealService;

    public AddMeal(MealService mealService) {
        this.mealService = mealService;
    }


    @Override
    public String execute(HttpServletRequest request) {

        String meal_name = request.getParameter("meal_name");
        String category = request.getParameter("category");
        String kkal = request.getParameter("kkal");
        String fats = request.getParameter("fats");
        String proteins = request.getParameter("proteins");
        String carbones = request.getParameter("carbones");


/*
        if (name == null || name.equals("") || password == null || password.equals("") || email == null || email.equals("")) {
            return "/registration.jsp";
        }

 */
        try {


            mealService.addMeal(meal_name,category,Integer.parseInt(kkal),
                    Integer.parseInt(fats),Integer.parseInt(proteins),
                    Integer.parseInt(carbones));
            List<Meal> meal = mealService.getAllMeals();
            //  request.setAttribute("meal",meal);
            LogIn.session.setAttribute("meal", meal);


        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return "/welcome.jsp";
    }
}
