package com.quarkworks.rootsnblues2016.backend;

/**
 * Created by brianfitzgerald on 5/5/16.
 */
public class Location {

    private String name;
    private String description;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
