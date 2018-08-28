package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CartoonServiceImp implements CartoonService {

    @Autowired
    private CartoonRepository cartoonRepository;

    @Override
    @Transactional(readOnly = true)
    public Cartoon getCartoonById(long id) {
        return cartoonRepository.findById(id);
    }


    @Override
    @Transactional
    public void addCartoon(Cartoon cartoon) {
        cartoonRepository.save(cartoon);
    }

    @Override
    @Transactional
    public void updateCartoon(Cartoon cartoon) {
        cartoonRepository.save(cartoon);
    }
}
