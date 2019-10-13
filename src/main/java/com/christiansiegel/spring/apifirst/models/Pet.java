package com.christiansiegel.spring.apifirst.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet {
    private long petId;
    private String name;

    @JsonProperty("pet_id")
    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}