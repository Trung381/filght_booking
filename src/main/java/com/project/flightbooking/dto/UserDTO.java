package com.project.flightbooking.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String username;
    private String email;
    private String phoneNumber;
    private String role;
    private String initialAirport;
} 