package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SportServiceImp implements SportService {

    @Autowired
    private SportRepository sportRepository;

    @Override
    @Transactional(readOnly = true)
    public Sport getSportById(long id) {
        return sportRepository.findById(id);
    }


    @Override
    @Transactional
    public void addSport(Sport sport) {
        sportRepository.save(sport);
    }

    @Override
    @Transactional
    public void updateSport(Sport sport) {
        sportRepository.save(sport);
    }
}
