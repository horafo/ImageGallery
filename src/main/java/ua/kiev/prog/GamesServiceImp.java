package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GamesServiceImp implements GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    @Override
    @Transactional(readOnly = true)
    public Games getGamesById(long id) {
        return gamesRepository.findById(id);
    }


    @Override
    @Transactional
    public void addGames(Games games) {
        gamesRepository.save(games);
    }

    @Override
    @Transactional
    public void updateGames(Games games) {
        gamesRepository.save(games);
    }
}
