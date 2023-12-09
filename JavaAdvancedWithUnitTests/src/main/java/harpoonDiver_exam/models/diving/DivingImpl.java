package harpoonDiver_exam.models.diving;

import harpoonDiver_exam.models.diver.Diver;
import harpoonDiver_exam.models.divingSite.DivingSite;

import java.util.Collection;

public class DivingImpl implements Diving {

    @Override
    public void searching(DivingSite divingSite, Collection<Diver> divers) {

        Collection<String> seaCreaturesInSite = divingSite.getSeaCreatures();

        for (Diver diver :  divers) {
            while (seaCreaturesInSite.iterator().hasNext() && diver.canDive()) {

                String curCreature = seaCreaturesInSite.iterator().next();
                diver.shoot();
                diver.getSeaCatch().getSeaCreatures().add(curCreature);
                seaCreaturesInSite.remove(curCreature);
            }
        }


    }
}