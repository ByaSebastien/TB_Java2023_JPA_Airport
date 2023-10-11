package be.btorm.models.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Intervention {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String objet;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private LocalDateTime dateIntervention;

    @Column(nullable = true)
    private int duree;

    @ManyToOne
    private Avion avion;

    @ManyToOne
    @JoinColumn(name = "reparateur_id")
    private Mechano reparateur;

    @ManyToOne
    @JoinColumn(name = "verificateur_id")
    private Mechano verificateur;
}
