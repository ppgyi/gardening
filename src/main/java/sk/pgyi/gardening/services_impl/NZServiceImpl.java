package sk.pgyi.gardening.services_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pgyi.gardening.entity.NakupnyZoznam;
import sk.pgyi.gardening.repositories.NZRepository;
import sk.pgyi.gardening.services.NZService;

import java.util.List;

@Service
public class NZServiceImpl implements NZService {

    @Autowired
    private NZRepository nzRepository;

    @Override
    public List<NakupnyZoznam> saveAll(List<NakupnyZoznam> nakupnyZoznam) {
        return nzRepository.saveAll(nakupnyZoznam);
    }

    @Override
    public List<NakupnyZoznam> findAll() {
        return nzRepository.findAll();
    }
}
