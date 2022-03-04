package sk.pgyi.gardening.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import sk.pgyi.gardening.entity.Projekty;

import java.time.LocalDate;

@Getter
public class ProjektResponse {

    private String nazov;
    private String popis;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate datum;
    private String adresaprojektu;
    private boolean ukoncene;

    public ProjektResponse(Projekty projekt) {
        this.nazov = projekt.getNazov();
        this.popis = projekt.getPopis();
        this.datum = projekt.getDatum();
        this.adresaprojektu = projekt.getAdresaprojektu();
        this.ukoncene = projekt.isUkoncene();
    }
}
