package sk.pgyi.gardening.services_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pgyi.gardening.entity.Klienti;
import sk.pgyi.gardening.entity.Projekty;
import sk.pgyi.gardening.entity.ProjektyUkoncene;
import sk.pgyi.gardening.repositories.KlientRepository;
import sk.pgyi.gardening.services.KlientService;
import sk.pgyi.gardening.services.ProjektService;
import sk.pgyi.gardening.services.ProjektyUkonceneService;

import java.util.ArrayList;
import java.util.List;

@Service
public class KlientServiceImpl implements KlientService {

    @Autowired
    private KlientRepository klientRepository;

    @Autowired
    private ProjektService projektService;

    @Autowired
    private ProjektyUkonceneService projektyUkonceneService;

    @Override
    public List<Klienti> saveAll(List<Klienti> klienti) {
        this.klientRepository.deleteAll();
        this.projektService.deleteAll();
        this.projektyUkonceneService.deleteAll();

//        List<Projekty> projekty = new ArrayList<>();
//        List<ProjektyUkoncene> projektyUkoncene = new ArrayList<>();
//
//        for (Klienti klient : klienti){
//            if (klient.getProjekty() != null){
//                for (Projekty projekt: klient.getProjekty()){
//                    projekty.add(projekt);
//                }
//            }
//        }
//        for (Klienti klient : klienti){
//            if (klient.getProjektyUkoncene() != null){
//                for (ProjektyUkoncene projektU: klient.getProjektyUkoncene()){
//                    projektyUkoncene.add(projektU);
//                }
//            }
//        }
//
//        this.projektService.saveAll(projekty);
//        this.projektyUkonceneService.saveAll(projektyUkoncene);
        return klientRepository.saveAll(klienti);
    }

    @Override
    public List<Klienti> findAll() {
        return klientRepository.findAll();
    }

    @Override
    public void deleteAll() {
        klientRepository.deleteAll();
    }
}
