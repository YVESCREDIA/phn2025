package org.udbl;

import java.util.List;

public class AnimalListRepository implements  AnimalRepository {
    private List<Animal> animals;

    @Override
    public void save(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public List<Animal> load() {
        return this.animals;
    }
}
