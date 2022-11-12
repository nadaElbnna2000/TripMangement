package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;



@Entity
public class StationModel implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)

    private Long id;

    String name;

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

    public StationModel() {
    }

    public StationModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
