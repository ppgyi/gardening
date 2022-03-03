package sk.pgyi.gardening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pgyi.gardening.entity.Klienti;

import java.util.List;

@Service
public class KlientServiceImpl implements KlientService{

    @Autowired
    private KlientRepository klientRepository;

    @Override
    public List<Klienti> saveAll(List<Klienti> klienti) {
        return klientRepository.saveAll(klienti);
    }

    @Override
    public List<Klienti> findAll() {
        return klientRepository.findAll();
    }
}
