package entity.algoritm;


import entity.User;

public class CountNormWoman extends CountNorm {
    @Override
    public int countMetabolizm() {

        return 0;
    }

    @Override
    public int countKkalNorm(User user) {
        int norm = (10 * user.getWeight() + user.getWeight() - 5 * user.getWeight() -161) * user.getActivityLevel();

        return norm;

    }


}
