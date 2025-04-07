import java.util.Objects;

public class Entry<K,V> {
    K key;
    V value;
    Entry<K, V> next=null;
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value, next);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entry<?, ?> entry = (Entry<?, ?>) o;
        return Objects.equals(key, entry.key) && Objects.equals(value, entry.value) && Objects.equals(next, entry.next);
    }

}
