package com.tns.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String collegeName;
    private String location;

    public College() {}

    public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}