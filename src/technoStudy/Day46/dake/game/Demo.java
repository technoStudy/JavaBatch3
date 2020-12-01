package technoStudy.Day46.dake.game;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Entity> entities = generateRandomEntites();

        // one round of the game
        for (Entity entity: entities) {
            for (Entity another : entities) {
//                entity.fight(another);
            }
        }

        checkWhoWins(entities);
    }

    private static void checkWhoWins(List<Entity> entities) {
        // check who is dead
    }

    private static List<Entity> generateRandomEntites() {
        List<Entity> generated = null;
        return  generated;
    }
}
