package org.hbs.controller;

import org.hbs.domain.Booking;
import org.hbs.model.Bookings;
import org.hbs.model.CreateBookingResponse;
import org.hbs.model.CreateBookingUpdateRequest;
import org.hbs.model.CreateBookingUpdateResponse;
import org.hbs.model.CreateBookingRequest;
import org.hbs.service.HbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/booking")
    public CreateBookingResponse createBooking(@RequestBody CreateBookingRequest request) {
        return service.createBooking(request.getGuest());
    }

    @DeleteMapping("/bookings")
    public void deleteAll() {
        service.deleteAll();
    }

    @DeleteMapping("/booking/{id}")
    public void deleteBooking(@PathVariable UUID id) { service.deleteBooking(id); }

    @PutMapping("/booking/{id}")
    public CreateBookingUpdateResponse putBooking(@PathVariable UUID id, @RequestBody CreateBookingUpdateRequest request) {
        return service.putBooking(id, request.getGuest());
    }

}
