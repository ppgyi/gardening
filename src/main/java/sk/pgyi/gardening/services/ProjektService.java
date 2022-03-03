package sk.pgyi.gardening.services;

import sk.pgyi.gardening.entity.Projekty;

import java.util.List;

public interface ProjektService {

    List<Projekty> saveAll(List<Projekty> projekty);
    List<Projekty> findAll();
    void deleteAll();
}
