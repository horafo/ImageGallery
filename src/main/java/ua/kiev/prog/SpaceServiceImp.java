package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpaceServiceImp implements SpaceService {

    @Autowired
    private SpaceRepository spaceRepository;

    @Override
    @Transactional(readOnly = true)
    public Space getSpaceById(long id) {
        return spaceRepository.findById(id);
    }


    @Override
    @Transactional
    public void addSpace(Space space) {
        spaceRepository.save(space);
    }

    @Override
    @Transactional
    public void updateSpace(Space space) {
        spaceRepository.save(space);
    }
}
