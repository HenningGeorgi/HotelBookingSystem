package org.hbs.model;

import java.time.LocalDate;

public class CreateBookingRequest {

    private String guest;
    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }
}
