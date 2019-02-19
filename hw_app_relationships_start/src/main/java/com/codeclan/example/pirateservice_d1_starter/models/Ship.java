package com.codeclan.example.pirateservice_d1_starter.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

//    @Column(name = "Pirate_List")
//    private ArrayList<Pirate> pirates;

    @OneToMany(mappedBy="ship")
    private List<Pirate> pirates;

    public Ship(String name, ArrayList<Pirate> pirates) {
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }

    public void setPirates(ArrayList<Pirate> pirates) {
        this.pirates = pirates;
    }
}
