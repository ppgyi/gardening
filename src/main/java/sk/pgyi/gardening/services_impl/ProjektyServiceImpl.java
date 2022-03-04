package sk.pgyi.gardening.services_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pgyi.gardening.repositories.ProjektRepository;
import sk.pgyi.gardening.services.ProjektService;


@Service
public class ProjektyServiceImpl implements ProjektService {

    @Autowired
    private ProjektRepository projektRepository;

    @Override
    public void deleteAll() {
        projektRepository.deleteAll();
    }
}
