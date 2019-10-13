package com.christiansiegel.spring.apifirst.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet {
    private long id;
    private String name;

    @JsonProperty
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}