package ua.kiev.prog;

public interface SpaceService {
    Space getSpaceById(long id);
    void addSpace(Space space);
    void updateSpace(Space space);
}

