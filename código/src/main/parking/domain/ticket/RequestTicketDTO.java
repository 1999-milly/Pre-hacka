package parking.domain.ticket;
import parking.domain.spot.Spot;
import parking.domain.vehicle.VehicleType;
import lombok.Data;
@Data
public class RequestTicktDTO{
    private String palate;
    private Integer vehicle_type_id;
    private Integer spot_id;
}
