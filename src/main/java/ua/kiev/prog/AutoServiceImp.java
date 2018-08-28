package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutoServiceImp implements AutoService {

    @Autowired
    private AutoRepository autoRepository;

    @Override
    @Transactional(readOnly = true)
    public Auto getAutoById(long id) {
        return autoRepository.findById(id);
    }


    @Override
    @Transactional
    public void addAuto(Auto auto) {
        autoRepository.save(auto);
    }

    @Override
    @Transactional
    public void updateAuto(Auto auto) {
        autoRepository.save(auto);
    }
}
