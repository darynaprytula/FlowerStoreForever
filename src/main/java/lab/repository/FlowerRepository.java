package lab.repository;

import lab.model.flowers.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
}
