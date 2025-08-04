package parking.repositories;
import parking.domain.vehicle.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer>{
}
