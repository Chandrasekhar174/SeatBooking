package com.example.SeatBooking.Controller;


import com.example.SeatBooking.Model.DTO.SeatDetails;
import com.example.SeatBooking.Model.Seat;
import com.example.SeatBooking.Service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping()
    public ResponseEntity<List<Seat>> getAllSeats() {
        List<Seat> seats = seatService.getAllSeats();
        return ResponseEntity.ok(seats);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SeatDetails> getSeatPricingById(@PathVariable Long id) {
        return seatService.getSeatPricingById(id);
    }

}
