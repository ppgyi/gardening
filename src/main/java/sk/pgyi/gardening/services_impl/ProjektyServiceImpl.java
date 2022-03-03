package sk.pgyi.gardening.services_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pgyi.gardening.entity.Projekty;
import sk.pgyi.gardening.repositories.ProjektRepository;
import sk.pgyi.gardening.services.ProjektService;

import java.util.List;

@Service
public class ProjektyServiceImpl implements ProjektService {

    @Autowired
    private ProjektRepository projektRepository;

    @Override
    public List<Projekty> saveAll(List<Projekty> projekty) {
        return projektRepository.saveAll(projekty);
    }

    @Override
    public List<Projekty> findAll() {
        return projektRepository.findAll();
    }

    @Override
    public void deleteAll() {
        projektRepository.deleteAll();
    }
}
