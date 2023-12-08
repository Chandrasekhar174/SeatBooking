package com.example.SeatBooking.Repository;

import com.example.SeatBooking.Model.SeatPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatPricingRepository extends JpaRepository<SeatPrice,Long> {

    Optional<SeatPrice> findBySeatClass(String seatClass);
}
