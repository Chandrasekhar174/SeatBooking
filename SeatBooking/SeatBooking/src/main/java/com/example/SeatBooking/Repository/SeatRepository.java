package com.example.SeatBooking.Repository;

import com.example.SeatBooking.Model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat,Long> {
//    List<Seat> findAllSeatsOrderedBySeatClass(String seatClass);

    List<Seat> findAllByOrderBySeatClassAsc();
}
