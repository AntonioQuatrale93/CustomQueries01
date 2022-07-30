package it.develhope.CustomQueries01.controller;

import it.develhope.CustomQueries01.entities.Flight;
import it.develhope.CustomQueries01.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping
    public void scheduleFlights() {
        flightService.setFlight();
    }

    @GetMapping
    public List<Flight> getFlights() {
        return flightService.flightLIst();
    }


}
