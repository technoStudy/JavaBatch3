package technoStudy.Day46.dake.game.entities.good;

import technoStudy.Day46.dake.game.entities.Good;
import technoStudy.Day46.dake.game.weapons.Bow;

public class Archer extends Good {
    public Archer() {
        health = 5;
        weapon = new Bow();
    }

    @Override
    public int doDamage() {
        return 3;
    }
}
