package org.hbs.model;

import java.util.UUID;

public class Guest {
    private UUID id;
    private String firstname;
    private String lastname;
    private String adress;

    public Guest(UUID id, String firstname, String lastname, String adress) {
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.adress=adress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
