package technoStudy.Day46.dake.game.entities.good;

import technoStudy.Day46.dake.game.entities.Good;
import technoStudy.Day46.dake.game.weapons.Sword;

public class Knight extends Good {
    public Knight() {
        health = 8;
        weapon = new Sword();
    }

    @Override
    public int doDamage() {
        return 5;
    }
}
