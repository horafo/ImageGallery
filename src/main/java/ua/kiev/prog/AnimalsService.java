package ua.kiev.prog;

public interface AnimalsService {
    Animals getAnimalsById(long id);
    void addAnimals(Animals animals);
    void updateAnimals(Animals animals);
}

