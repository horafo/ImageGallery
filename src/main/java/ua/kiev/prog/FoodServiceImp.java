package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FoodServiceImp implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    @Transactional(readOnly = true)
    public Food getFoodById(long id) {
        return foodRepository.findById(id);
    }


    @Override
    @Transactional
    public void addFood(Food food) {
        foodRepository.save(food);
    }

    @Override
    @Transactional
    public void updateFood(Food food) {
        foodRepository.save(food);
    }
}
