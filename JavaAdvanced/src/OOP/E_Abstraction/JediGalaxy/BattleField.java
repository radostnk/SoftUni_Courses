package OOP.E_Abstraction.JediGalaxy;

public class BattleField {
    private int[][] battleField;

    public BattleField(int rows, int cols) {
        this.battleField = new int[rows][cols];
        this.fillBattleFiled(rows, cols);
    }

    private void fillBattleFiled(int rows, int cols) {

        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.battleField[i][j] = value++;
            }
        }
    }

    public int getValue(int row, int col) {
            return this.battleField[row][col];
    }
    public void setValue(int row, int col, int newValue) {
        this.battleField[row][col] = newValue;
    }

    public int getColLength(int row) {
        return this.battleField[row].length;
    }
    boolean isValidIndex(int row, int col) {
        return row >= 0 && row < this.battleField.length && col >= 0 && col < this.battleField[row].length;
    }
}
