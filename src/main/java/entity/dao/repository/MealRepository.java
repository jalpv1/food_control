package entity.dao.repository;

import entity.Meal;
import entity.dao.query.MealQuery;
import entity.dao.utill.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MealRepository {
    public ArrayList<Meal> getMeal(){
        Connection connection = MyConnection.gettingConnection();
        ArrayList<Meal> meals = new ArrayList<Meal>();
        Meal meal ;
        try {
            String M = MealQuery.GET_MEAL;
            PreparedStatement statement =
                    connection.prepareStatement(MealQuery.GET_MEAL);

           // statement.setString(1,"pizza");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                meal = new Meal(resultSet.getString(2),resultSet.getString(3)
                        ,resultSet.getInt(4)  ,resultSet.getInt(5)  ,resultSet.getInt(6)
                        ,resultSet.getInt(7));
                meals.add(meal);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return meals;
    }
    public void getNorm(){

    }
    public ArrayList<Meal> getMealByName(String name){
        Connection connection = MyConnection.gettingConnection();
        ArrayList<Meal> meals = new ArrayList<Meal>();
        Meal meal ;
        try {
            String M = MealQuery.GET_MEAL_BY_NAME;
            PreparedStatement statement =
                    connection.prepareStatement(MealQuery.GET_MEAL_BY_NAME);

            statement.setString(1,name);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                meal = new Meal(resultSet.getString(2),resultSet.getString(3)
                        ,resultSet.getInt(4)  ,resultSet.getInt(5)  ,resultSet.getInt(6)
                        ,resultSet.getInt(7));
                meals.add(meal);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return meals;
    }
    public void addMeal(String name, String type, int amoundOfKkal,
                        int amoundOfCarbonHydrates, int amoundOfProteins, int amoundOfFats){
        Connection connection = MyConnection.gettingConnection();

        try {
            String M = MealQuery.GET_MEAL_BY_NAME;
            PreparedStatement statement =
                    connection.prepareStatement(MealQuery.PUT_USER_MEAL);

            statement.setString(1,name);
            statement.setString(2,type);
            statement.setInt(3,amoundOfKkal);
            statement.setInt(4,amoundOfProteins);
            statement.setInt(5,amoundOfCarbonHydrates);
            statement.setInt(6,amoundOfFats);

            statement.executeUpdate();

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    /*
    public void addMealOwnList(Meal meal){
        Connection connection = MyConnection.gettingConnection();

        try {
            PreparedStatement statement =
                    connection.prepareStatement(MealQuery.PUT_USER_MEAL);

            statement.setString(1,name);
            statement.setString(2,type);
            statement.setInt(3,amoundOfKkal);
            statement.setInt(4,amoundOfProteins);
            statement.setInt(5,amoundOfCarbonHydrates);
            statement.setInt(6,amoundOfFats);

            statement.executeUpdate();

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

     */
}
