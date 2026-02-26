package edu.iesam.features.domain;

public class Autor {

    private final String id;
    private final String name;

    public Autor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

