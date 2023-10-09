package L_Abstraction.HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SECOND_VISIT(0.9),

    NONE(1);

    private double discountSize;

    DiscountType(double discountSize) {
        this.discountSize = discountSize;
    }

    public double getDiscountSize() {
        return discountSize;
    }

    public void setDiscountSize(double discountSize) {
        this.discountSize = discountSize;
    }

    public static DiscountType parse (String str) {
        switch (str) {
            case "VIP":
                return VIP;

            case "SecondVisit":
                return SECOND_VISIT;

            case "None":
                return NONE;

            default:
                throw new IllegalArgumentException("Unknown Discount Type");
        }
    }
}
