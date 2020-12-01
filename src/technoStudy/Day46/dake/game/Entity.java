package technoStudy.Day46.dake.game;

import technoStudy.Day46.dake.game.weapons.Weapon;

public abstract class Entity {
    int health;
    Weapon weapon;

    boolean isDead() {
        return health <= 0;
    }
}
