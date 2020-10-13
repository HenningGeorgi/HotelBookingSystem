package org.hbs.model;

import javax.validation.constraints.NotNull;

public class CreateBookingUpdateRequest extends CreateBookingRequest{

    @NotNull
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
