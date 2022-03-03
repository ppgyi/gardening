package sk.pgyi.gardening.services;

import sk.pgyi.gardening.entity.ProjektyUkoncene;

import java.util.List;

public interface ProjektyUkonceneService {

    List<ProjektyUkoncene> saveAll(List<ProjektyUkoncene> projektyukoncene);
    List<ProjektyUkoncene> findAll();
    void deleteAll();
}
