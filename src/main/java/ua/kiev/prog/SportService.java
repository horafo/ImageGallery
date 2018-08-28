package ua.kiev.prog;

public interface SportService {
    Sport getSportById(long id);
    void addSport(Sport sport);
    void updateSport(Sport sport);
}

