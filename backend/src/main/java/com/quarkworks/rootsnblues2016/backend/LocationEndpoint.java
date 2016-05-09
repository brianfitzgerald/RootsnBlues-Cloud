package com.quarkworks.rootsnblues2016.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
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
        name = "locationApi",
        version = "v1",
        resource = "location",
        namespace = @ApiNamespace(
                ownerDomain = "backend.rootsnblues2016.quarkworks.com",
                ownerName = "backend.rootsnblues2016.quarkworks.com",
                packagePath = ""
        )
)
public class LocationEndpoint {

    private static final Logger logger = Logger.getLogger(LocationEndpoint.class.getName());
    private static final DatastoreService datastoreService = DatastoreServiceFactory.getDatastoreService();

    /**
     * This method gets the <code>Location</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Location</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getLocation")
    public Location getLocation(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getLocation method");
        return null;
    }

    @ApiMethod(name = "getAllLocations", path = "locations")
    public List<Location> getAllLocations() {

        List<Location> locationList = new ArrayList<>();

        logger.info("Calling getLocation method");
        Query query = new Query("Location");
        PreparedQuery preparedQuery = datastoreService.prepare(query);
        for (Entity result : preparedQuery.asIterable()) {
            locationList.add(new Location((String) result.getProperty("title"), (String) result.getProperty("description")));
        }

        return locationList;
    }

    /**
     * This inserts a new <code>Location</code> object.
     *
     * @param location The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertLocation")
    public Location insertLocation(Location location) {
        // TODO: Implement this function
        logger.info("Calling insertLocation method");
        return location;
    }
}