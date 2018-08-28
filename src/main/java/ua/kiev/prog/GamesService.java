package ua.kiev.prog;

public interface GamesService {
    Games getGamesById(long id);
    void addGames(Games games);
    void updateGames(Games games);
}

