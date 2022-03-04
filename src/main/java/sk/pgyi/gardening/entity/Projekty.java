package sk.pgyi.gardening.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="projekty")
@Getter
@Setter
public class Projekty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "klient_id")
    private  Klienti klient;

    @Column(name="nazov")
    private String nazov;

    @Column(name="popis")
    private String popis;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="datum")
    private LocalDate datum;

    @Column(name="adresaprojektu")
    private String adresaprojektu;

    @Column(name="ukoncene")
    private boolean ukoncene;
}
