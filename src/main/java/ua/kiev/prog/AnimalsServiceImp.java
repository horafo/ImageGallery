package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnimalsServiceImp implements AnimalsService {

    @Autowired
    private AnimalsRepository animalsRepository;

    @Override
    @Transactional(readOnly = true)
    public Animals getAnimalsById(long id) {
        return animalsRepository.findById(id);
    }


    @Override
    @Transactional
    public void addAnimals(Animals animals) {
        animalsRepository.save(animals);
    }

    @Override
    @Transactional
    public void updateAnimals(Animals animals) {
        animalsRepository.save(animals);
    }
}
