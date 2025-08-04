package parking.repositories;
import parking.domain.spot.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SpotRepository extends JpaRepository<Spot,Integer>{
}
