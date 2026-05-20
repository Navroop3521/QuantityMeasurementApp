package com.quantity.measurement.repository;

import com.quantity.measurement.entity.Entity;
import java.util.List;
public interface Repository {

    void save(Entity entity);
    
    List<Entity> getAllMeasurements(); // Make sure this matches DatabaseRepository exactly
    void deleteAll();
}