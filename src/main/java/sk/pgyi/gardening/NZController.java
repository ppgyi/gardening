package sk.pgyi.gardening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.pgyi.gardening.entity.NakupnyZoznam;
import sk.pgyi.gardening.services_impl.NZServiceImpl;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class NZController {

    @Autowired
    private NZServiceImpl nzService;

    @GetMapping("/polozky")
    public List<NakupnyZoznam> getAllPolozky(){
        return nzService.findAll();
    }

    @PostMapping("/polozky")
    public String createZoznam(@RequestBody List<NakupnyZoznam> zoznam){
        nzService.saveAll(zoznam);
        return "Nakupny zoznam pridany";
    }
}
