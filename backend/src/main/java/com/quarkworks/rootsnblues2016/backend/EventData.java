package com.quarkworks.rootsnblues2016.backend;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.socket.SocketServicePb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brianfitzgerald on 4/20/16.
 */
public class EventData {

    private List<Event> eventsList;

    public EventData() {
        eventsList = new ArrayList<>();


    }

//    public void RequestEvents() {
//            Entity locationEntity = null;
//            Location location = null;
//            String keyID =  (String) result.getProperty("location");
//            Key key = KeyFactory.createKey("Event", keyID);
//            try {
//                locationEntity = datastoreService.get(key);
//            } catch (EntityNotFoundException e) {
//                e.printStackTrace();
//            }
//            if (locationEntity != null) {
//                location = new Location((String) locationEntity.getProperty("name"), (String) locationEntity.getProperty("description"));
//            }
//
//
//            eventsList.add(new Event((String) result.getProperty("name"), new Location("Cool Town", "a cool town"), (String) result.getProperty("description")));
//            eventsList.add(new Event((String) result.getProperty("name"), key.toString()));
//    }


    public List<Event> getEventsList() {
        return eventsList;
    }
}
