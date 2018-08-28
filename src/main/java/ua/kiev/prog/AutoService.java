package ua.kiev.prog;

public interface AutoService {
    Auto getAutoById(long id);
    void addAuto(Auto auto);
    void updateAuto(Auto auto);
}

