package sk.pgyi.gardening.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="klienti")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Klienti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="meno")
    private String meno;

    @Column(name="priezvisko")
    private String priezvisko;

    @Column(name="adresa")
    private String adresa;

    @Column(name="telefon")
    private String telefon;

    @Column(name="email")
    private String email;

    @OneToMany(mappedBy = "klient", cascade = CascadeType.ALL)
    private List<Projekty> projekty;

    @OneToMany(mappedBy = "klient", cascade = CascadeType.ALL)
    private List<ProjektyUkoncene> projektyukoncene;
}
