package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NatureServiceImp implements NatureService {

    @Autowired
    private NatureRepository natureRepository;

    @Override
    @Transactional(readOnly = true)
    public Nature getNatureById(long id) {
        return natureRepository.findById(id);
    }


    @Override
    @Transactional
    public void addNature(Nature nature) {
        natureRepository.save(nature);
    }

    @Override
    @Transactional
    public void updateNature(Nature nature) {
        natureRepository.save(nature);
    }
}
