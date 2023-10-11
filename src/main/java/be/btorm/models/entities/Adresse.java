package be.btorm.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

    @Column(nullable = false)
    private String rue;
    @Column(nullable = false)
    private String numero;
    @Column(nullable = false)
    private String codePostal;
    @Column(nullable = false)
    private String ville;
}
