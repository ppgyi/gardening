package sk.pgyi.gardening;

import sk.pgyi.gardening.entity.Klienti;

import java.util.List;

public interface KlientService {

    List<Klienti> saveAll(List<Klienti> klienti);
    List<Klienti> findAll();

}
