package be.btorm.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Mechano extends Personne{

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<TypeAvion> typeAvions;

    public Set<TypeAvion> getTypeAvions(){
        return Set.copyOf(this.typeAvions);
    }
    public void addTypeAvion(TypeAvion typeAvion){
        this.typeAvions.add(typeAvion);
    }
    public void removeTypeAvion(TypeAvion typeAvion){
        this.typeAvions.remove(typeAvion);
    }
}
