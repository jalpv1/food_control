package entity.dao.query;
public class UserQuery {

    public static final String TABLE_NAME = "users";

    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";
    public static final String ID = "user_id";


    public static final String TABLE_NAME_NORM = "user_norm";
    public static final String AMOUND_KKAL ="amound_kkal";
    public static final String AMOUND_PROTEINS ="amound_proteins";
    public static final String AMOUND_CARBONES ="amound_carbones";
    public static final String AMOUND_FATS = "amound_fats";

    public static final String GET_BY_LOGIN_PASSWORD = "SELECT * FROM "+ TABLE_NAME + " WHERE "+ LOGIN +" =(?)" +
            " AND " + PASSWORD +" =(?)" ;
    public static final String GET_BY_LOGIN = "SELECT * FROM "+ TABLE_NAME + " WHERE "+ LOGIN +" =(?)" ;

    public static final String GET_PASSWORD_BY_LOGIN = "SELECT * FROM "+ TABLE_NAME + " WHERE "+ LOGIN +" =(?)" + "AND"
            + PASSWORD + " =(?)";
    public static final String GET_NORM = "SELECT * FROM" +TABLE_NAME_NORM + " WHERE "+ LOGIN +" =(?)";

    public static final String GET_USER = "SELECT * FROM "+ TABLE_NAME;
    public static final   String GET_USER_BY_ID = "SELECT * FROM " +TABLE_NAME + " WHERE "+ ID +" = ? ";
    public static final   String ADD_USER = "INSERT INTO " +TABLE_NAME +" (login, password,sex,weight," +
            "activitylevel,amound_kkal, amound_proteins, amound_carbones, amound_fats) "+
            " VALUES (?,?,?,?,?,?,?,?,?) ";

    public static final   String ADD_NORM = "INSERT INTO " +TABLE_NAME_NORM +
            " (amound_kkal, amound_proteins, amound_carbones, amound_fats)"+
            " VALUES (?,?,?,?) ";
}
