package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArchitectureServiceImp implements ArchitectureService {

    @Autowired
    private ArchitectureRepository architectureRepository;

    @Override
    @Transactional(readOnly = true)
    public Architecture getArchitectureById(long id) {
        return architectureRepository.findById(id);
    }


    @Override
    @Transactional
    public void addArchitecture(Architecture architecture) {
        architectureRepository.save(architecture);
    }

    @Override
    @Transactional
    public void updateArchitecture(Architecture architecture) {
        architectureRepository.save(architecture);
    }
}
