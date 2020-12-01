package technoStudy.Day46.dake.game.entities.evil;

import technoStudy.Day46.dake.game.entities.Evil;
import technoStudy.Day46.dake.game.weapons.Sword;

public class Troll extends Evil {
    public Troll() {
        health = 10;
        weapon = new Sword();
    }

    @Override
    public int doDamage() {
        return 7;
    }
}
