package com.example.SeatBooking.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

    @Id
    private Long id;
    private String seat_identifiers;
    private String seatClass;
    private boolean isBooked= false;


}

