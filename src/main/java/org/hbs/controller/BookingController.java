package org.hbs.controller;

import org.hbs.model.Booking;
import org.hbs.model.Bookings;
import org.hbs.model.CreateBookingResponse;
import org.hbs.model.CreateBookingUpdateRequest;
import org.hbs.model.CreateBookingUpdateResponse;
import org.hbs.model.CreateBookingRequest;
import org.hbs.service.HbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BookingController {

    @Autowired
    HbsService service;

    @GetMapping("/bookings")
    public Bookings getBookings() {
        return service.getBookings();
    }

    @GetMapping("/booking/{id}")
    public Booking get(@PathVariable UUID id) {
        return service.getBooking(id);
    }

    @PostMapping("/booking")
    public CreateBookingResponse createBooking(@RequestBody CreateBookingRequest request) {
        return service.createBooking(request.getGuest(), request.getRoom());
    }

    @DeleteMapping("/booking/{id}")
    public void deleteBooking(UUID id) { service.delete(); }

    @PutMapping("/booking/{id}")
    public CreateBookingUpdateResponse putBooking(@PathVariable UUID id, @RequestBody CreateBookingUpdateRequest request)

}