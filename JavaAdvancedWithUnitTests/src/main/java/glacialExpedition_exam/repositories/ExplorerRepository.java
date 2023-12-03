package glacialExpedition_exam.repositories;

import glacialExpedition_exam.models.explorers.Explorer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExplorerRepository implements Repository<Explorer> {

    private Collection<Explorer> explorers;

    public ExplorerRepository() {
        this.explorers = new ArrayList<>();
    }

    @Override
    public Collection<Explorer> getCollection() {
        return Collections.unmodifiableCollection(this.explorers);
    }

    @Override
    public void add(Explorer explorer) {
        explorers.add(explorer);
    }

    @Override
    public boolean remove(Explorer explorer) {
        return explorers.removeIf(ex -> ex.equals(explorer));
    }

    @Override
    public Explorer byName(String name) {
        return explorers.stream()
                .filter(n -> n.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}

