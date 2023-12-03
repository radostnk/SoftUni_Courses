package glacialExpedition_exam.models.explorers;

public class GlacierExplorer extends BaseExplorer {

    public static final double INITIAL_ENERGY = 40;

    public GlacierExplorer(String name) {
        super(name, INITIAL_ENERGY);
    }
}
