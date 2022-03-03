package sk.pgyi.gardening.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.pgyi.gardening.entity.Projekty;

@Repository
public interface ProjektRepository extends JpaRepository<Projekty, Long> {
}
