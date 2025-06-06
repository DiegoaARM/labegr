package com.udea.labegr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    private String seatNumber;

    private String reservationCode;
}
