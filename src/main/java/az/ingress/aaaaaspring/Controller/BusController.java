package az.ingress.aaaaaspring.Controller;

import az.ingress.aaaaaspring.Model.Response.BusDetailsResponse;
import az.ingress.aaaaaspring.Service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/bus")
public class BusController {
    private final BusService busService;
    @GetMapping("{id}")
    public BusDetailsResponse getBus(@PathVariable Long id) {
        return   busService.getBus(id);
    }
}

