package org.hbs.model;

import java.time.LocalDate;

public class CreateBookingRequest {
    private Guest guest;
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
