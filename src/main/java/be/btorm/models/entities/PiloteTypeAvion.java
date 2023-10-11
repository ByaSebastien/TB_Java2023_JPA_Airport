package be.btorm.models.entities;

import jakarta.persistence.*;

@Entity
public class PiloteTypeAvion {

    @EmbeddedId
    private PiloteTypeAvionId id;

    private int dureeVol;
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("piloteId")
    private Pilote pilote;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("nomTypeAvion")
    private TypeAvion typeAvion;
}
