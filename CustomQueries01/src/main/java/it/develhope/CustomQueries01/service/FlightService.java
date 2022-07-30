package it.develhope.CustomQueries01.service;

import it.develhope.CustomQueries01.entities.Flight;
import it.develhope.CustomQueries01.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

import static it.develhope.CustomQueries01.entities.StatusEnum.ONTIME;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public void setFlight() {
        int counter = 0;
        while (counter < 50) {
            Random random = new Random();
            Flight flight = new Flight(random.nextLong(20), random.ints(20).toString(), random.ints(20).toString(), random.ints(20).toString(), ONTIME);
            flightRepository.save(flight);
            counter++;
        }
    }

    public List<Flight> flightLIst() {
        return flightRepository.findAll();
    }
}
