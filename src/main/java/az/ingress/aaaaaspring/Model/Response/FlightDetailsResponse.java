package az.ingress.aaaaaspring.Model.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightDetailsResponse {
    private String from;
    private String to;
    private LocalDateTime time;
    private String planeModel;
    private Integer passangerCount;
    private String pilotName;

}
