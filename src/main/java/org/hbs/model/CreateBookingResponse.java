package org.hbs.model;

import java.util.UUID;

public class CreateBookingResponse {
    private final UUID id;
    private Guest guest;

    public CreateBookingResponse(UUID id, Guest guest) {
        this.id=id;
        this.guest=guest;
    }
}
