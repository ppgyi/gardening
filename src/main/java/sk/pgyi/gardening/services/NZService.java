package sk.pgyi.gardening.services;

import sk.pgyi.gardening.entity.NakupnyZoznam;

import java.util.List;

public interface NZService {
    List<NakupnyZoznam> saveAll(List<NakupnyZoznam> nakupnyZoznam);
    List<NakupnyZoznam> findAll();
}
