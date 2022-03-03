package sk.pgyi.gardening.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    // Statemaster model contains the object of Districtmaster model,
    // which itself contains the object of Statemaster model. This
    // causes an infinite json recursion.
    @JsonManagedReference
    @OneToMany(mappedBy = "klient", cascade = CascadeType.ALL)
    private List<Projekty> projekty;

    @JsonManagedReference
    @OneToMany(mappedBy = "klient", cascade = CascadeType.ALL)
    private List<ProjektyUkoncene> projektyukoncene;
}
