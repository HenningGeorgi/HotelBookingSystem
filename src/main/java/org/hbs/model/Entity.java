package org.hbs.model;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

public abstract class Entity {
    @NotEmpty
    protected final UUID id;

    public Entity(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
