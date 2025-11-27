package org.udbl;

import java.util.List;

public interface AnimalRepository {
    public void save(List<Animal> animals);
    public List<Animal> load();
}
