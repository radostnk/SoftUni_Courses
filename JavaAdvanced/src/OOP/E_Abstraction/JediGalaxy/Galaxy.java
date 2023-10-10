package OOP.E_Abstraction.JediGalaxy;

public class Galaxy {
    private BattleField field;
    private Jedi jedi;
    private Evil evil;

    public Galaxy(BattleField field) {
        this.field = field;
        this.jedi = new Jedi();
        this.evil = new Evil();
    }

    public long getJediStars(int jediRow, int jediCol) {
        return jedi.getJediStars(jediRow, jediCol, this.field);
    }
    public void moveEvil(int evilRow, int evilCol) {
        evil.moveEvil(evilRow, evilCol, this.field);
    }
}
