package handball_exam.entities.team;

public class Germany extends BaseTeam {

    public Germany(String name, String country, int advantage) {
        super(name, country, advantage);
    }

    @Override
    public void play() {
        this.setAdvantage(getAdvantage() + 145);
    }
}