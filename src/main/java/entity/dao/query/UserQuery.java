package entity.dao.query;
public class UserQuery {

    public static final String TABLE_NAME = "users";
    public static final String NAME = "login";
    public static final String PASSWORD = "password";

    public static final String TABLE_NAME_NORM = "user_norm";
    public static final String AMOUND_KKAL ="amound_kkal";
    public static final String AMOUND_PROTEINS ="amound_proteins";
    public static final String AMOUND_CARBONES ="amound_carbones";
    public static final String AMOUND_FATS = "amound_fats";

    public static final String GET_BY_LOGIN = "SELECT * FROM "+ TABLE_NAME + " WHERE "+ NAME +" =(?)";
    public static final String GET_NORM = "SELECT * FROM" +TABLE_NAME_NORM + " WHERE "+ NAME +" =(?)";

    public static final String GET_USER = "SELECT * FROM "+ TABLE_NAME;
}
