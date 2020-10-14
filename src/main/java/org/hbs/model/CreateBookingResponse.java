package org.hbs.model;

import java.util.UUID;

public class CreateBookingResponse {
    private final UUID id;
    private String guest;

    public CreateBookingResponse(UUID id, String guest) {
        this.id=id;
        this.guest=guest;
    }
}
