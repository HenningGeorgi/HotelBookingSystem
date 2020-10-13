package org.hbs.model;

import java.util.UUID;

public class Room{
    private UUID id;
    private Integer floor, roomNumber;
    private RoomType roomType;

    public Room(UUID id, Integer floor, Integer roomNumber, RoomType roomType) {
        this.id=id;
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.roomType=roomType;
    }
}