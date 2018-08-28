package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BrandServiceImp implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    @Transactional(readOnly = true)
    public Brand getBrandById(long id) {
        return brandRepository.findById(id);
    }


    @Override
    @Transactional
    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    @Transactional
    public void updateBrand(Brand brand) {
        brandRepository.save(brand);
    }
}
