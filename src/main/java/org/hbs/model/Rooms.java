package org.hbs.model;

import java.util.ArrayList;
import java.util.List;

public class Rooms {
    public List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms=rooms;
    }
}
