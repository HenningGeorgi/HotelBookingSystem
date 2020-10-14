package org.hbs.model;

import java.time.LocalDate;

public class CreateBookingRequest {
<<<<<<< Updated upstream
    private Guest guest;

    public Guest getGuest() {
=======
    private String guest;
    public String getGuest() {
>>>>>>> Stashed changes
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }
}
