package sk.pgyi.gardening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.pgyi.gardening.entity.Klienti;
import sk.pgyi.gardening.services_impl.KlientServiceImpl;

import java.util.List;

@RestController
public class KlientController {

    @Autowired
    private KlientServiceImpl klientService;

    @GetMapping
    public List<Klienti> getKlientiList(){
        return klientService.findAll();
    }

    @PostMapping
    public String createKlienti(@RequestBody List<Klienti> klienti){
        klientService.saveAll(klienti);
        return "Klienti ulozeni";
    }
}
