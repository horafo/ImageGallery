package ua.kiev.prog;

public interface ArchitectureService {
    Architecture getArchitectureById(long id);
    void addArchitecture(Architecture architecture);
    void updateArchitecture(Architecture architecture);
}

