package harpoonDiver_exam.repositories;

import harpoonDiver_exam.models.divingSite.DivingSite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DivingSiteRepository implements Repository<DivingSite> {

    private Collection<DivingSite> sites;

    public DivingSiteRepository() {
        this.sites = new ArrayList<>();
    }

    @Override
    public Collection<DivingSite> getCollection() {
        return Collections.unmodifiableCollection(sites);
    }

    @Override
    public void add(DivingSite site) {
        sites.add(site);
    }

    @Override
    public boolean remove(DivingSite site) {
        return sites.removeIf(s -> s.equals(site));
    }

    @Override
    public DivingSite byName(String name) {
        return sites.stream()
                .filter(s -> s.getName().equals(name))
                .findAny()
                .orElse(null);
    }
}