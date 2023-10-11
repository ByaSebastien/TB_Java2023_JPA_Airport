package be.btorm.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Pilote extends Personne {

    @Column(unique = true,nullable = false)
    private String numeroBrevet;

    @OneToMany(mappedBy = "pilote")
    private Set<PiloteTypeAvion> piloteTypeAvions;
}
