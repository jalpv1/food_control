package entity;

public class User {

    private String login;
    private String password;

    public User(String login, String password,String sex,int weight,int activityLevel) {
        this.login = login;
        this.password = password;
        this.activityLevel = activityLevel;
        this.sex = sex;
        this.weight = weight;
    }

    private int activityLevel;
    private String sex;
    private int weight;

    private int KkalNorm;
    private int carbonHydratesNorm;
    private int fatsNorm;
    private int proteinsNorm;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", activityLevel=" + activityLevel +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", KkalNorm=" + KkalNorm +
                ", carbonHydratesNorm=" + carbonHydratesNorm +
                ", fatsNorm=" + fatsNorm +
                ", proteinsNorm=" + proteinsNorm +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(int activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getKkalNorm() {
        return KkalNorm;
    }

    public void setKkalNorm(int kkalNorm) {
        KkalNorm = kkalNorm;
    }

    public int getCarbonHydratesNorm() {
        return carbonHydratesNorm;
    }

    public void setCarbonHydratesNorm(int carbonHydratesNorm) {
        this.carbonHydratesNorm = carbonHydratesNorm;
    }

    public int getFatsNorm() {
        return fatsNorm;
    }

    public void setFatsNorm(int fatsNorm) {
        this.fatsNorm = fatsNorm;
    }

    public int getProteinsNorm() {
        return proteinsNorm;
    }

    public void setProteinsNorm(int proteinsNorm) {
        this.proteinsNorm = proteinsNorm;
    }


}
