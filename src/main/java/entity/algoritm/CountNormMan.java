package entity.algoritm;

import entity.User;

public class CountNormMan extends CountNorm {
    @Override
    public int countMetabolizm() {
        return 0;
    }

    @Override
    public int countKkalNorm(User user) {
        int norm = (10 * user.getWeight() + user.getWeight() - 5 * user.getWeight() + 5) * user.getActivityLevel();
        return 0;
    }
/*
    @Override
    public double contCarbones(User user) {
        return  user.getWeight()* 1.1;;
    }
    @Override
    public double contFats(User user) {
        return  user.getWeight()* 1.2;;
    }
    @Override
    public double contProteins(User user) {
        return  user.getWeight()* 0.8;
    }

 */
}
