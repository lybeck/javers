package org.javers.core.example;

import java.util.Map;

import org.javers.core.metamodel.annotation.Id;

/**
 *
 * @author llybeck
 */
class DataObject {

    @Id
    private final int id;
    private Map<KeyObject, String> map;

    DataObject(int id) {
        this.id = id;
    }

    void setMap(Map<KeyObject, String> map) {
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public Map<KeyObject, String> getMap() {
        return map;
    }
}
