package com.quarkworks.rootsnblues2016.backend;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

/**
 * Created by brianfitzgerald on 4/20/16.
 */
public class Event {
    private String name;
    private Location location;
    private Key locationKey;
    private String description;

    public Event(String name, Location location, String description) {
        this.name = name;
        this.location = location;
        this.description = description;
    }

    public Event(String name, Key locationKey, String description) {
        this.name = name;
        this.locationKey = locationKey;
        this.description = description;
    }

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

}
