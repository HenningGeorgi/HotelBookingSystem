package org.hbs.model;


public class Room{
    private Integer floor, roomNumber;
    private RoomType roomType;

    public Room(Integer floor, Integer roomNumber, RoomType roomType) {
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.roomType=roomType;
    }
}