import java.util.*;

public class LRUCacheTest {
    public static void main(String[] args) {
        LRUCache lruCahche = new LRUCache(2);
        lruCahche.put(1,1);
        lruCahche.put(2,2);
        System.out.println(lruCahche.get(1));
        lruCahche.put(3,3);
        System.out.println(lruCahche.get(2));
        lruCahche.put(4,4);
        System.out.println(lruCahche.get(1));
        System.out.println(lruCahche.get(3));
        System.out.println(lruCahche.get(4  ));

    }
}

class LRUCache{
    private int capacity;
    List<Process> list;
    public LRUCache(int capacity){
        this.capacity = capacity;
        this.list = new LinkedList<>();
    }

    public int getCapacity(){
        return capacity;
    }


    public int get(int key){
        int temp = indexOf(new Process(key));
        if (temp == -1)
            return -1;
        else {
            Process pro = list.get(temp);
            int result = pro.value;
            list.remove(temp);
            list.add(pro);
            return result;
        }
    }

    public void put(int key, int value){
        Process temp = new Process(key, value);
        if (list.size() < getCapacity()){
            int point = indexOf(temp);
            if (point == -1)
                list.add(temp);
            else {
                list.remove(point);
                list.add(temp);
            }
        }
        else {
            int point = indexOf(temp);
            if (point == -1){
                list.remove(0);
                list.add(temp);
            }
            else {
                list.remove(point);
                list.add(temp);
            }
        }
    }

    public int indexOf(Process temp){
        int i = 0;
        int point = -1;
        while (i < list.size()){
            if (list.get(i).equals(temp)){
                point = i;
                break;
            }
            else
                i++;
        }
        return point;
    }
}

class Process{
    public int key;
    public int value;

    public Process(int key, int value){
        this.value = value;
        this.key = key;
    }

    public Process(int key){
        this.key = key;
    }

    public Process(){
    }

    //Override
    public boolean equals(Process process) {
        if (this.key == process.key)
            return true;
        else
            return false;
    }
}
