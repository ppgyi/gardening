package sk.pgyi.gardening;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sk.pgyi.gardening.entity.Klienti;

@Repository
public interface KlientRepository extends JpaRepository<Klienti, Long> {
}
