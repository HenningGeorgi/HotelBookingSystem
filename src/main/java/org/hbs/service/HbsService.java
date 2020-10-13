package org.hbs.service;

import org.hbs.model.Booking;
import org.hbs.model.Bookings;
import org.hbs.model.CreateBookingResponse;
import org.hbs.model.CreateBookingUpdateResponse;
import org.hbs.model.Guest;
import org.hbs.model.Room;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HbsService {
    public Bookings getBookings() {
        return null;
    }

    public Booking getBooking(UUID id) {
        return null;
    }

    public CreateBookingResponse createBooking(Guest guest) {
        Booking booking = new Booking(UUID.randomUUID(), guest);
        return new CreateBookingResponse(booking.getId(), booking.getGuest());
    }

    public void deleteAll() {
    }

    public void deleteBooking(UUID id) {
    }

    public CreateBookingUpdateResponse putBooking(UUID id, Guest newGuest) {
        Booking booking = getBooking(id);

        booking.setGuest(newGuest);
        return new CreateBookingUpdateResponse(id, newGuest);
    }
}
