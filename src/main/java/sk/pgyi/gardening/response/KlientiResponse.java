package sk.pgyi.gardening.response;

import lombok.Getter;
import sk.pgyi.gardening.entity.Klienti;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class KlientiResponse {

    private String meno;
    private String priezvisko;
    private String adresa;
    private String telefon;
    private String email;
    private List<ProjektResponse> projekty;
    private List<ProjektyUkonceneResponse> projektyukoncene;

    public KlientiResponse(Klienti klient) {
        this.meno = klient.getMeno();
        this.priezvisko = klient.getPriezvisko();
        this.adresa = klient.getAdresa();
        this.telefon = klient.getTelefon();
        this.email = klient.getEmail();
        this.projekty = klient.getProjekty().stream().map(ProjektResponse::new).collect(Collectors.toList());
        this.projektyukoncene = klient.getProjektyukoncene().stream().map(ProjektyUkonceneResponse::new).collect(Collectors.toList());
    }
}
