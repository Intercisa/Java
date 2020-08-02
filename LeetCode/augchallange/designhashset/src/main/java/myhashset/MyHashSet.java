package main.java.myhashset;

import java.util.HashMap;

class MyHashSet {
    private HashMap<Integer, Integer> map;
    /** Initialize your data structure here. */
    public MyHashSet() {
        map = new HashMap<>();
    }
    
    public void add(int key) {
        if(map.containsKey(key)) return;
        map.put(key, key);
    }
    
    public void remove(int key) {
        if(map.containsKey(key)) map.remove(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return map.containsKey(key);
    }

    // for testing
    public int size(){
        return map.size();
    }
}
