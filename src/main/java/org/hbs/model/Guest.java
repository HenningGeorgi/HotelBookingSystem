package org.hbs.model;

import java.util.UUID;

public class Guest {
    private String firstname;
    private String lastname;
    private String adress;

    public Guest(String firstname, String lastname, String adress) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.adress=adress;
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
