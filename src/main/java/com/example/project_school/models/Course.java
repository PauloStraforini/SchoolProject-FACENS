package com.example.project_school.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer workLoad; // Carga Horária
    
    public Course() {
    }

    public Course(Long id, String name, Integer workLoad) {
        this.id = id;
        this.name = name;
        this.workLoad = workLoad;
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

    public Integer getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(Integer workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", workLoad=" + workLoad + "]";
    }
}
