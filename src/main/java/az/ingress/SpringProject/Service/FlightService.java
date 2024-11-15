package az.ingress.SpringProject.Service;

import az.ingress.SpringProject.Model.Response.FlightDetailsResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class FlightService {
    public FlightDetailsResponse getFlights(Long id) {


Map<Long, FlightDetailsResponse> map =new ConcurrentHashMap<>();
    map.put(1L , FlightDetailsResponse.builder()
            .from("Baku")
            .to("leipzig")
            .time(LocalDateTime.of(2024,11,29,15,35))
            .planeModel("Airbus A350")
            .passangerCount(86)
            .pilotName("Vagif")
            .build());


        map.put(2L , FlightDetailsResponse.builder()
                .from("Baku")
                .to("Moscow")
                .time(LocalDateTime.of(2024,12,25,9,15))
                .planeModel("Boeing 746")
                .passangerCount(90)
                .pilotName("Ferid")
                .build());


        map.put(3L , FlightDetailsResponse.builder()
                .from("Baku")
                .to("London")
                .time(LocalDateTime.of(2024,12,9,10,00))
                .planeModel("Airbus A400")
                .passangerCount(78)
                .pilotName("Ferhad")
                .build());

        map.put(4L , FlightDetailsResponse.builder()
                .from("Baku")
                .to("Tallin")
                .time(LocalDateTime.of(2025,1,1,21,00))
                .planeModel("Boeing 345")
                .passangerCount(84)
                .pilotName("Emrah")
                .build());

        map.put(5L , FlightDetailsResponse.builder()
                .from("Baku")
                .to("Tokio")
                .time(LocalDateTime.of(2025,1,14,3,50))
                .planeModel("Boeing 777")
                .passangerCount(95)
                .pilotName("Parvin")
                .build());
        return map.get(id);
    }
}
