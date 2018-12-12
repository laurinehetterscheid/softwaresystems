package ss.week5;

import java.util.HashMap;
import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUtil {
	
    public static <K, V> boolean isOneOnOne(Map<K, V> map) {
    	    		
    	//loop all values
        for (V value : map.values()) {
        	int countKeys = 0;
        	
        	//loop all keys
        	for(K key : map.keySet()) {
        		if(map.get(key) == value) {
        			countKeys++;
        		}
        	}
        	
        	if(countKeys != 1) {
        		return false;
        	}
        }
        return true;
    }
    
    
    public static <K, V> boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {
    	
    	Iterator it = range.iterator();
    	    	
    	while (it.hasNext()) {
    		
    		 for (Map.Entry<K, V> entry : map.entrySet()) {
    			 if(!it.equals(entry.getValue())){
    				 return false;
    			 }
    		 }
    	}
    	return true;
    }
    
    
    

    public static <K, V> boolean isSurjectiveOnRange2(Map<K, V> map, Set<V> range) {
    	
    	// Loop all values in range set
    	for (V rangeValue : range) {
    		
    		// Loop all keys in the map
    		for (K key : map.keySet()) {
    			
    			if (rangeValue != map.get(key)) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    
    public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
        // TODO: implement, see exercise P-5.3
        return null;
	}
	public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
        // TODO: implement, see exercise P-5.3
        return null;
	}
	public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
        // TODO: implement, see exercise P-5.4
        return false;
	}
	public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
        // TODO: implement, see exercise P-5.5
        return null;
	}
}
