package com.udea.labegr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;

    private String origin;

    private String destination;

    private int seatsAvailable;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Reservation> reservations;

}
