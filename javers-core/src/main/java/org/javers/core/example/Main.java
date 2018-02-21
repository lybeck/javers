package org.javers.core.example;

import java.util.HashMap;
import java.util.Map;

import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;

/**
 *
 * @author llybeck
 */
public class Main {

    public static void main(String[] args) {

        DataObject object1 = new DataObject(1);
        Map<KeyObject, String> map1 = new HashMap<>();
        object1.setMap(map1);

        DataObject object2 = new DataObject(1);
        Map<KeyObject, String> map2 = new HashMap<>();
        map2.put(new KeyObject(1, 2), null);
        object2.setMap(map2);

        JaversBuilder b = JaversBuilder.javers();
        Javers javers = b.build();

        // this compare call fails in a NullPointerException
        Diff diff = javers.compare(object1, object2);
        System.out.println("object diff = " + diff);
    }
}
