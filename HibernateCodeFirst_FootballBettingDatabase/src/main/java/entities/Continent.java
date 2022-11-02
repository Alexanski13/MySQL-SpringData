package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "continents")
public class Continent extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "continents")
    private Set<Country> countries;
}

