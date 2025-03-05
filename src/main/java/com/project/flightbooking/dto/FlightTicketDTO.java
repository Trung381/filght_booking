package com.project.flightbooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class FlightTicketDTO {
    private Long flightId;
    private String flightNumber;
    private String airlineName;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String status;
    private BigDecimal economyPrice;
    private BigDecimal businessPrice;
    private BigDecimal firstClassPrice;
    private Integer availableSeats;

    // Constructor matching the JPQL query parameters
    public FlightTicketDTO(Long flightId, String flightNumber, String airlineName, 
                          String departureAirport, String arrivalAirport, 
                          LocalDateTime departureTime, LocalDateTime arrivalTime, 
                          String status) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
        
    }
}