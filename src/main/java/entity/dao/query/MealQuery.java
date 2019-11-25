package entity.dao.query;

public class MealQuery {
    public static final String TABLE_NAME = "meal";

    public static final String NAME = "name";
    public static final String CATEGORY = "category";
    public static final String AMOUND_KKAL ="amound_kkal";
    public static final String AMOUND_PROTEINS ="amound_proteins";
    public static final String AMOUND_CARBONES ="amound_carbones";
    public static final String AMOUND_FATS = "amound_fats";


    public static final String GET_MEAL_BY_NAME = "SELECT * FROM "+TABLE_NAME + " WHERE "+ NAME + "=?";
    public static final String GET_MEAL = "select * from  "+TABLE_NAME;

    public static final String GET_MEAL_СOUNT ="SELECT " +AMOUND_CARBONES+","+AMOUND_FATS+","+
            AMOUND_PROTEINS+","+AMOUND_KKAL+" FROM "+TABLE_NAME + " WHERE "+ NAME + "=?";;

    public static final String PUT_USER_MEAL_BY_USERNAME ="INSERT INTO";

}
