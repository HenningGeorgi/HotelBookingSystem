package org.hbs.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.UUID;

public class Booking extends Entity{
    private Guest guest;

    public Booking(UUID id, Guest guest) {
        super(id);
        this.guest=guest;
    }
}
