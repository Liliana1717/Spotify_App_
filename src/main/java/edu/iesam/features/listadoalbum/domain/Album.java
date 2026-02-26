package edu.iesam.features.listadoalbum.domain;

public class Album {
    private final String id;
    private final String name;
    private final int year;

    public Album(String id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

