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
}
