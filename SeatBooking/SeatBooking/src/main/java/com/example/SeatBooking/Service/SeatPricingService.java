package com.example.SeatBooking.Service;

import com.example.SeatBooking.Model.SeatPrice;
import com.example.SeatBooking.Repository.SeatPricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeatPricingService {
    @Autowired
    private SeatPricingRepository seatPricingRepository;

    public Optional<SeatPrice> getPricingBySeatClass(String seatClass) {
        return seatPricingRepository.findBySeatClass(seatClass);
    }

    public double calculateBookingAmount(String seatClass, int percentageBooked) {
        Optional<SeatPrice> pricingOptional = getPricingBySeatClass(seatClass);
        double price = 0;

        if (pricingOptional.isPresent()) {
            SeatPrice pricing = pricingOptional.get();


            if (percentageBooked < 40) {
                price= pricing.getMinPrice();
            } else if (percentageBooked <= 60) {
                price= pricing.getNormalPrice();
            } else {
                price =pricing.getMaxPrice();
            }
        }
        if(price ==0){
            return pricingOptional.get().getNormalPrice();
        }
        return price; // Handle the case where pricing is not available
    }
}

