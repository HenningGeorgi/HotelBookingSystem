package org.hbs.model;

import java.util.ArrayList;
import java.util.List;

public class Bookings {
    public List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings=bookings;
    }
}
