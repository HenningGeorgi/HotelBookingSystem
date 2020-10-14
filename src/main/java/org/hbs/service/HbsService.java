package org.hbs.service;

import org.hbs.domain.Booking;
import org.hbs.model.Bookings;
import org.hbs.model.CreateBookingResponse;
import org.hbs.model.CreateBookingUpdateResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class HbsService {
    public ArrayList<Booking> bookings = new ArrayList<>();

    public Bookings getBookings() {
        Bookings bookings = new Bookings();
        bookings.setBookings(this.bookings);
        return bookings;
    }

    public Booking getBooking(UUID id) {
        Optional<Booking> booking = bookings.stream()
                .filter(g -> g.getId().equals(id))
                .findAny();
        return booking.get();
    }

    public CreateBookingResponse createBooking(String guest) {
        Booking booking = new Booking(UUID.randomUUID(), guest);
        bookings.add(booking);
        return new CreateBookingResponse(booking.getId(), booking.getGuest());
    }

    public void deleteAll() {
        bookings = new ArrayList<Booking>();
    }

    public void deleteBooking(UUID id) {
        Optional<Booking> booking = bookings.stream()
                .filter(g -> g.getId().equals(id))
                .findAny();
        bookings.remove(booking);
    }

    public CreateBookingUpdateResponse putBooking(UUID id, String newGuest) {
        Booking booking = getBooking(id);
        booking.setGuest(newGuest);
        return new CreateBookingUpdateResponse(id, newGuest);
    }
}
