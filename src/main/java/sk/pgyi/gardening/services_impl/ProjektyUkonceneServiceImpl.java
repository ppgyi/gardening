package sk.pgyi.gardening.services_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pgyi.gardening.repositories.ProjektyUkonceneRepository;
import sk.pgyi.gardening.services.ProjektyUkonceneService;


@Service
public class ProjektyUkonceneServiceImpl implements ProjektyUkonceneService {

    @Autowired
    private ProjektyUkonceneRepository projektyUkonceneRepository;

    @Override
    public void deleteAll() {
        projektyUkonceneRepository.deleteAll();
    }
}
