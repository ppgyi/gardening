package sk.pgyi.gardening.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="nakupnyzoznam")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NakupnyZoznam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nazov")
    private String nazov;

    @Column(name="pocet")
    private Long pocet;
}
