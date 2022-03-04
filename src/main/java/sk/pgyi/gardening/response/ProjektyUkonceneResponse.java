package sk.pgyi.gardening.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import sk.pgyi.gardening.entity.ProjektyUkoncene;

import java.time.LocalDate;

@Getter
public class ProjektyUkonceneResponse {

    private String nazov;
    private String popis;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate datum;
    private String adresaprojektu;
    private boolean ukoncene;

    public ProjektyUkonceneResponse(ProjektyUkoncene projektUkonceny) {
        this.nazov = projektUkonceny.getNazov();
        this.popis = projektUkonceny.getPopis();
        this.datum = projektUkonceny.getDatum();
        this.adresaprojektu = projektUkonceny.getAdresaprojektu();
        this.ukoncene = projektUkonceny.isUkoncene();
    }
}
