package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransportServiceImp implements TransportService {

    @Autowired
    private TransportRepository transportRepository;

    @Override
    @Transactional(readOnly = true)
    public Transport getTransportById(long id) {
        return transportRepository.findById(id);
    }


    @Override
    @Transactional
    public void addTransport(Transport transport) {
        transportRepository.save(transport);
    }

    @Override
    @Transactional
    public void updateTransport(Transport transport) {
        transportRepository.save(transport);
    }
}
