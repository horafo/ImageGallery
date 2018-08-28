package ua.kiev.prog;

public interface TransportService {
    Transport getTransportById(long id);
    void addTransport(Transport transport);
    void updateTransport(Transport transport);
}

