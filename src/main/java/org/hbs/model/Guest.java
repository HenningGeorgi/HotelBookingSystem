package org.hbs.model;

import java.util.UUID;

public class Guest extends Entity{

    private String firstname;
    private String lastname;
    private String adress;

    public Guest(UUID id, String firstname, String lastname, String adress) {
        super(id);
        this.firstname=firstname;
        this.lastname=lastname;
        this.adress=adress;
    }
}
