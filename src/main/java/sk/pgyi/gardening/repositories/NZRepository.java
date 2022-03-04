package sk.pgyi.gardening.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.pgyi.gardening.entity.NakupnyZoznam;

@Repository
public interface NZRepository extends JpaRepository<NakupnyZoznam, Long> {
}
