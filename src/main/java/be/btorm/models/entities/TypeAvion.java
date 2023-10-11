package be.btorm.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
public class TypeAvion {

    @Id
    private String nom;

    @Column(nullable = false)
    private String nomConstr;

    @Column(nullable = false)
    private String puissance;

    @Column(nullable = false)
    private int nbPlaces;

    @ManyToMany(mappedBy = "typeAvions")
    private Set<Mechano> mechanos;

    public TypeAvion() {
        this.mechanos = new HashSet<>();
    }

    public Set<Mechano> getMechanos() {
        return Set.copyOf(this.mechanos);
    }

    public void addMechano(Mechano mechano){
        this.mechanos.add(mechano);
    }

    public void removeMechano(Mechano mechano){
        this.mechanos.remove(mechano);
    }
}
