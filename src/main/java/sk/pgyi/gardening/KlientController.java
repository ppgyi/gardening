package sk.pgyi.gardening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.pgyi.gardening.entity.Klienti;
import sk.pgyi.gardening.response.KlientiResponse;
import sk.pgyi.gardening.services_impl.KlientServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class KlientController {

    @Autowired
    private KlientServiceImpl klientService;

//    @GetMapping
//    public List<Klienti> getKlientiList(){
//        return klientService.findAll();
//    }

    @GetMapping("/klienti")
    public List<KlientiResponse> getKlientiList(){
    return klientService.findAll().stream()
            .map(KlientiResponse::new)
            .collect(Collectors.toList());
}

    @PostMapping("/klienti")
    public String createKlienti(@RequestBody List<Klienti> klienti){
        klientService.saveAll(klienti);
        return "Klienti ulozeni";
    }
}
