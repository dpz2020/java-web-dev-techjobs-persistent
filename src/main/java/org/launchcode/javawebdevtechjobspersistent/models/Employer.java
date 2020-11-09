package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {



    public Employer() {

        this.jobs = new ArrayList<Job>();

    }
    @JoinColumn(name="employer_id")
    @OneToMany
    private List<Job> jobs;


    @NotBlank
    @Size(max=255)
    private String location;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
