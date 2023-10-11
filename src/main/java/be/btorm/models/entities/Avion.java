package be.btorm.models.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Avion {

    @Id
    private String imma;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private LocalDate dateAchat;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Proprio proprio;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private TypeAvion typeAvion;
}
