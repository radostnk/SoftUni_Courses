package harpoonDiver_exam.core;

import harpoonDiver_exam.models.diver.DeepWaterDiver;
import harpoonDiver_exam.models.diver.Diver;
import harpoonDiver_exam.models.diver.OpenWaterDiver;
import harpoonDiver_exam.models.diver.WreckDiver;
import harpoonDiver_exam.models.diving.DivingImpl;
import harpoonDiver_exam.models.divingSite.DivingSite;
import harpoonDiver_exam.models.divingSite.DivingSiteImpl;
import harpoonDiver_exam.repositories.DiverRepository;
import harpoonDiver_exam.repositories.DivingSiteRepository;

import java.util.List;
import java.util.stream.Collectors;

import static harpoonDiver_exam.common.ConstantMessages.*;
import static harpoonDiver_exam.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private DiverRepository diverRepo;
    private DivingSiteRepository siteRepo;
    private int sitesVisited;

    public ControllerImpl() {
        this.diverRepo = new DiverRepository();
        this.siteRepo = new DivingSiteRepository();
        this.sitesVisited = 0;
    }

    @Override
    public String addDiver(String kind, String diverName) {

        Diver diver;

        switch (kind) {
            case "DeepWaterDiver":
                diver = new DeepWaterDiver(diverName);
                break;

            case "OpenWaterDiver":
                diver = new OpenWaterDiver(diverName);
                break;

            case "WreckDiver":
                diver = new WreckDiver(diverName);
                break;

            default:
                throw new IllegalArgumentException(DIVER_INVALID_KIND);
        }

        diverRepo.add(diver);
        return String.format(DIVER_ADDED, kind, diverName);
    }

    @Override
    public String addDivingSite(String siteName, String... seaCreatures) {
        DivingSite site = new DivingSiteImpl(siteName);

        for (String curCreature : seaCreatures) {
            site.getSeaCreatures().add(curCreature);
        }

        siteRepo.add(site);
        return String.format(DIVING_SITE_ADDED, siteName);
    }

    @Override
    public String removeDiver(String diverName) {
        Diver diver = diverRepo.byName(diverName);

        if (diverRepo.remove(diver)) {
            return String.format(DIVER_REMOVE, diverName);
        }

        throw new IllegalArgumentException(String.format(DIVER_DOES_NOT_EXIST, diverName));
    }

    @Override
    public String startDiving(String siteName) {
        List<Diver> suitableDivers = diverRepo.getCollection()
                .stream()
                .filter(d -> d.getOxygen() > 30)
                .collect(Collectors.toList());

        if (suitableDivers.isEmpty()) {
            throw new IllegalArgumentException(SITE_DIVERS_DOES_NOT_EXISTS);
        }

        DivingSite curSite = siteRepo.byName(siteName);
        DivingImpl diving = new DivingImpl();

        diving.searching(curSite, suitableDivers);
        long removedDiversCount = suitableDivers.stream().filter(d -> d.getOxygen() <= 0).count();
        this.sitesVisited ++;

        return String.format(SITE_DIVING, siteName, removedDiversCount);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(FINAL_DIVING_SITES, this.sitesVisited));
        sb.append(System.lineSeparator());
        sb.append(FINAL_DIVERS_STATISTICS);

        diverRepo.getCollection().forEach(d -> sb.append(System.lineSeparator()).append(d.toString()));

        return sb.toString();
    }
}