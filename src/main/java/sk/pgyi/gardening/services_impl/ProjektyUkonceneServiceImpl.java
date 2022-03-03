package sk.pgyi.gardening.services_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pgyi.gardening.entity.ProjektyUkoncene;
import sk.pgyi.gardening.repositories.ProjektyUkonceneRepository;
import sk.pgyi.gardening.services.ProjektyUkonceneService;

import java.util.List;

@Service
public class ProjektyUkonceneServiceImpl implements ProjektyUkonceneService {

    @Autowired
    private ProjektyUkonceneRepository projektyUkonceneRepository;

    @Override
    public List<ProjektyUkoncene> saveAll(List<ProjektyUkoncene> projektyukoncene) {
        return projektyUkonceneRepository.saveAll(projektyukoncene);
    }

    @Override
    public List<ProjektyUkoncene> findAll() {
        return projektyUkonceneRepository.findAll();
    }

    @Override
    public void deleteAll() {
        projektyUkonceneRepository.deleteAll();
    }
}
