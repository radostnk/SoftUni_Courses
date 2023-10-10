package OOP.E_Abstraction.JediGalaxy;

public class Evil {

    public void moveEvil(int evilRow, int evilCol, BattleField field) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (field.isValidIndex(evilRow, evilCol)) {
                field.setValue(evilRow, evilCol, 0);
            }

            evilRow--;
            evilCol--;
        }
    }
}
