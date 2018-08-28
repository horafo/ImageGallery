package ua.kiev.prog;

public interface CartoonService {
    Cartoon getCartoonById(long id);
    void addCartoon(Cartoon cartoon);
    void updateCartoon(Cartoon cartoon);
}

