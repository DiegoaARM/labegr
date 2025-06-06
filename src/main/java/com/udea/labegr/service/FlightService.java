package com.udea.labegr.service;

import com.udea.labegr.entity.Flight;
import com.udea.labegr.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return Optional.ofNullable(flightRepository.findAll())
                .orElseThrow(() -> new RuntimeException("No flight available"));
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("flight not found for id: " + id));
    }

    
}
