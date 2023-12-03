package glacialExpedition_exam.models.explorers;

public class NaturalExplorer extends BaseExplorer {

    public static final double INITIAL_ENERGY = 60;

    public NaturalExplorer(String name) {
        super(name, INITIAL_ENERGY);
    }

    @Override
    public void search() {
        if (this.getEnergy() <= 7) {
            this.setEnergy(0);
        } else {
            this.setEnergy(getEnergy() - 7);
        }
    }
}