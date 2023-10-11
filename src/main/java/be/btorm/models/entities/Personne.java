package be.btorm.models.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"nom","rue","numero","codePostal"})
})
public abstract class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Embedded
    private Adresse adresse;

    @Column(unique = true,nullable = true)
    private String tel;
}
