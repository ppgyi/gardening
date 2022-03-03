package sk.pgyi.gardening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.pgyi.gardening.entity.Klienti;

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
