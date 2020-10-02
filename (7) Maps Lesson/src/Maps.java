public class Maps {
    /*not in collections interface, diff than sets/lists
    mapping = pointing one obj to another obj
    have key and value
        key "points" to value
        keys are unique, values aren't always unique
    ex: HashMap, HashTable, LinkedHashMap and treeMap constructs
        HashMap/HashTable
            keyset must be unique, so must implement hashcode, equals method
            DONT maintain insertion order (like hashset)
            keySet() method
                returns set of all key obj in map
                can create iterator, access values with get(obj) method

        need 2 classes to generate 2 obj types
        add() becomes put()
        map.get(key) = value

            instead of puting index position, put key

        Linked HashMap keeps insertion order, but slower than hashmap

        treeMap
            treeMap needs comparable interface (like treeset)
            basically treeset but also map
                also has headmap, tailmap, submap
            getting an "entry"
                make set, obj type = Map.Entry
                Map.Entry makes entry object
                entry obj is any obj that enters set
                with iterator, iterate over entry obj
                <Map.Entry<Car, owner>>
                Entry.getKey = key
                Entry.getValue = value




    */
}
