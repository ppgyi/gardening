package sk.pgyi.gardening.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.pgyi.gardening.entity.ProjektyUkoncene;

@Repository
public interface ProjektyUkonceneRepository extends JpaRepository<ProjektyUkoncene, Long> {
}
