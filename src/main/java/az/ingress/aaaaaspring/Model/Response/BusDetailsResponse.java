package az.ingress.aaaaaspring.Model.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusDetailsResponse {
    private String from;
    private String to;
    private LocalDateTime time;
    private String BusNumber;
    private Integer passangerCount;
    private String driverName;


}
