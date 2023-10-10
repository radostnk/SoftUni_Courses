package OOP.E_Abstraction.JediGalaxy;

public class Jedi {

    public long getJediStars(int jediRow, int jediCol, BattleField field) {
        long starsCollected = 0;

        while (jediRow >= 0 && jediCol < field.getColLength(1)) {
            if (field.isValidIndex(jediRow, jediCol)) {
                starsCollected += field.getValue(jediRow, jediCol);
            }

            jediCol++;
            jediRow--;
        }
        return starsCollected;
    }
}
