package org.example;

public class Pair<K,V> {
    public K key;
    public V value;





    public Pair(K key, V value) {
        this.key = key;
        this.value= value;
        if(key==null){
            throw new IllegalArgumentException("key is null");
        }

    }
    public void getKey(){
        System.out.println(key);
    }
    public void getValue(){
        System.out.println(value);
    }
    public String toString(){
        System.out.println("pair  " + key +"  " +value);

        return  "";
    }


}
