package com.quarkworks.rootsnblues2016.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "eventApi",
        version = "v1",
        resource = "event",
        namespace = @ApiNamespace(
                ownerDomain = "backend.rootsnblues2016.quarkworks.com",
                ownerName = "backend.rootsnblues2016.quarkworks.com",
                packagePath = ""
        )
)
public class EventEndpoint {

    private static final Logger logger = Logger.getLogger(EventEndpoint.class.getName());
    private static final DatastoreService datastoreService = DatastoreServiceFactory.getDatastoreService();

    /**
     * This method gets the <code>Event</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Event</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getEvent", path = "event")
    public Event getEvent(@Named("eventID") long id) {
        logger.info("getting single event");
        Event foundEvent = null;
        try {
            Entity eventDatastoreObject = datastoreService.get(KeyFactory.createKey("Event", id));
            foundEvent = new Event((String) eventDatastoreObject.getProperty("name"), (String) eventDatastoreObject.getProperty("details"));
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
        }

        return foundEvent;
    }

    @ApiMethod(name = "getAllEvents", path = "events")
    public List<Event> getAllEvents() {

        List<Event> eventList = new ArrayList<>();
        logger.info("getting all events");
        Query query = new Query("Event").addSort("name");
        PreparedQuery preparedQuery = datastoreService.prepare(query);
        for (Entity result : preparedQuery.asIterable()) {
            eventList.add(new Event((String) result.getProperty("name"), (String) result.getProperty("details")));
        }

        return eventList;
    }


    /**
     * This inserts a new <code>Event</code> object.
     *
     * @param event The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertEvent")
    public Event insertEvent(Event event) {
        DatastoreService datastoreService = DatastoreServiceFactory.getDatastoreService();
        // TODO: Implement this function
        logger.info("Calling insertEvent method");
        return event;
    }
}