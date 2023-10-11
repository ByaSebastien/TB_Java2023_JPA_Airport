package be.btorm.models.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PiloteTypeAvionId implements Serializable {

    private Long piloteId;
    private String nomTypeAvion;
}
