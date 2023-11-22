package L_UnitTesting.rpg_lab;

import java.util.Optional;

public interface Target {
    void takeAttack(int attackPoints);

    int giveExperience();

    boolean isDead();
}
