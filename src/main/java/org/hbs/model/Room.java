package org.hbs.model;

import java.util.UUID;

public class Room extends Entity{
    private int floor, RoomNumber;
    private RoomType roomType;

    public Room(UUID id) {
        super(id);
    }
}
