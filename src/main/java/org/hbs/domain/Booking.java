package org.hbs.domain;

import org.hbs.model.Guest;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.UUID;

public class Booking {
    private UUID id;
    private String guest;

    public Booking() {}

    public Booking(UUID id, String guest) {
        this.id=id;
        this.guest=guest;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
