package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private String branch;
    private String section;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("branch") String branch,
                  @JsonProperty("section") String section) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.section = section;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getSection() {
        return section;
    }
}
