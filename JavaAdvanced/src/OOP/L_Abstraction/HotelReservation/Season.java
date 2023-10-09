package L_Abstraction.HotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplication;

    Season(int multiplication) {
        this.multiplication = multiplication;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }

    public static Season parse(String str) {
        return Season.valueOf(str.toUpperCase());
    }
}
