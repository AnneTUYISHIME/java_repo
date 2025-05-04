package org.example;

public class Pair<K, V> {
    private  K key;
    private  V value;


    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // toString method
    @Override
    public String toString() {
        return "(Key: " + key + ", Value: " + value + ")";
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?, ?> other = (Pair<?, ?>) obj;
        return key.equals(other.key) &&
                (value == null ? other.value == null : value.equals(other.value));
    }

    // hashCode method
    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    // Static factory method
    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }



}
