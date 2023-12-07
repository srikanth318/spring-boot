package com.demointerview.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "director_details")
public class DirectorDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generateId")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "movies", nullable = false)
    private String movies;
}
