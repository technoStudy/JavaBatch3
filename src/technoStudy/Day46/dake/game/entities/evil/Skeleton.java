package technoStudy.Day46.dake.game.entities.evil;

import technoStudy.Day46.dake.game.entities.Evil;
import technoStudy.Day46.dake.game.weapons.Bow;

public class Skeleton extends Evil {
    public Skeleton() {
        health = 3;
        weapon = new Bow();
    }

    @Override
    public int doDamage() {
        return 2;
    }
}
