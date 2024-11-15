package az.ingress.aaaaaspring.Controller;

import az.ingress.aaaaaspring.Model.Response.FlightDetailsResponse;
import az.ingress.aaaaaspring.Service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/flights")

public class FlightController {
    private final FlightService flightService;
@GetMapping("{id}")
public FlightDetailsResponse getFlight(@PathVariable Long id) {
   return   flightService.getFlights(id);
}
        }
