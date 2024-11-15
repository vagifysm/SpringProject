package az.ingress.aaaaaspring.Service;


import az.ingress.aaaaaspring.Model.Response.BusDetailsResponse;
import az.ingress.aaaaaspring.Model.Response.FlightDetailsResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BusService {
    public BusDetailsResponse getBus(Long id){
        Map<Long, BusDetailsResponse> map =new ConcurrentHashMap<>();
        map.put(1L , BusDetailsResponse.builder()
                .from("Baku")
                .to("Ganja")
                .BusNumber("90-BX-624")
                .passangerCount(45)
                .time(LocalDateTime.of(2024,11,16,8,00))
                .driverName("Ehed")
                .build());

        map.put(2L , BusDetailsResponse.builder()
                .from("Baku")
                .to("Qazax")
                .BusNumber("35-BB-035")
                .passangerCount(70)
                .time(LocalDateTime.of(2024,12,13,14,30))
                .driverName("Vagif")
                .build());

        map.put(3L , BusDetailsResponse.builder()
                .from("Baku")
                .to("Gabala")
                .BusNumber("90-NH-435")
                .passangerCount(68)
                .time(LocalDateTime.of(2024,12,29,19,50))
                .driverName("Ferhad")
                .build());

        return map.get(id);



    }
}


