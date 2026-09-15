package com.tns.placementmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "placement")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    private LocalDate date;
    private String qualification;
    private int year;

    public Placement() {}

    public Placement(String name, College college, LocalDate date, String qualification, int year) {
        this.name = name;
        this.college = college;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public College getCollege() { return college; }
    public void setCollege(College college) { this.college = college; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}