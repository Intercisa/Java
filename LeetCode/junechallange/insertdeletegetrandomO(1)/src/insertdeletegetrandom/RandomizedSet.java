package insertdeletegetrandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {

	ArrayList<Integer> _values;
	HashMap<Integer, Integer> _locations;
	private Random rand;

	/** Initialize your data structure here. */
	public RandomizedSet() {
		_values = new ArrayList<Integer>();
		_locations = new HashMap<Integer, Integer>();
		rand = new Random();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		boolean contain = _locations.containsKey(val);
        if (contain) return false;
        
        _locations.put(val, _values.size());
        _values.add(val);
        return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		
		if(!_locations.containsKey(val)) return false;
         
        int loc = _locations.get(val);
        if (loc < _values.size() - 1 ) { // not the last one than swap the last one with this val
            int lastone = _values.get(_values.size() - 1);
            _values.set(loc, lastone);
            _locations.put(lastone, loc);
        }
        _locations.remove(val);
        _values.remove(_values.size() - 1);
        return true;
		
	}


	/** Get a random element from the set. */
	public int getRandom() {
		  return _values.get(rand.nextInt(_values.size()));
	}

}
