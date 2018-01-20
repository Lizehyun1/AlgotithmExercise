import org.w3c.dom.Entity;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheAC {

}

class CacheList {
    private int capacity;
    private Map<Integer, Integer> cache;

    public CacheList(int capacity){
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity);
    }

    public int getCapacity(){
        return capacity;
    }

    public int get(int key){
        Integer value = cache.get(key);
        if (value != null) {
            cache.remove(key, value);
            cache.put(key, value);
            return value;
        }
        else
            return -1;
    }

    public void put(int key, int value) {
        if (cache.size() < capacity) {
            if (cache.containsKey(key)) {
                cache.remove(key);
                cache.put(key, value);
            }
            else {
                cache.put(key, value);
            }
        }
        else {
            if (cache.containsKey(key)) {
                cache.remove(key);
                cache.put(key,value);
            }
            else {
                int[] nums = new int[capacity];
                int i = 0;
                for(Map.Entry<Integer, Integer> entry : cache.entrySet()) {
                    nums[i] = entry.getKey();
                    i++;
                }
                cache.remove(nums[0]);
                cache.put(key, value);
            }
        }
    }
}
