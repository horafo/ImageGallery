package ua.kiev.prog;

public interface NatureService {
    Nature getNatureById(long id);
    void addNature(Nature nature);
    void updateNature(Nature nature);
}

