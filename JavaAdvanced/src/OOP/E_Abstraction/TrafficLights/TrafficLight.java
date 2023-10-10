package OOP.E_Abstraction.TrafficLights;

public class TrafficLight {
    private Color currentColor;

    public TrafficLight(Color currentColor) {
        this.currentColor = currentColor;
    }

    public void changeColor() {
        switch (currentColor) {
            case RED:
                this.setCurrentColor(Color.GREEN);
                break;

            case GREEN:
                this.setCurrentColor(Color.YELLOW);
                break;

            case YELLOW:
                this.setCurrentColor(Color.RED);
                break;
        }
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }
}
