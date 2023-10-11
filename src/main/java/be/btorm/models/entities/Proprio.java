package be.btorm.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Proprio extends Personne{

    @Column(nullable = false)
    private String categorie;
}
