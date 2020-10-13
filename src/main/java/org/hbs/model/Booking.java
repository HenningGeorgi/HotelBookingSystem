package org.hbs.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.UUID;

public class Booking {
    private UUID id;
    private Guest guest;

    public Booking() {}

    public Booking(UUID id, Guest guest) {
        this.id=id;
        this.guest=guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
