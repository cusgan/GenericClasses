package MyMap;

import java.util.ArrayList;

public class MyMap<S,T> {
    private ArrayList<S> keys = new ArrayList<>();
    private ArrayList<T> vals = new ArrayList<>();

    public MyMap() {}

    public void put(S key, T value) {
        if (keys.contains(key)) {
            int i = keys.indexOf(key);
            vals.set(i, value);
            return;
        }
        keys.add(key);
        vals.add(value);
    }

    public T get(S key) {
        int i = keys.indexOf(key);
        if (i == -1) return null;
        return vals.get(i);
    }

    public T remove(S key) {
        int i = keys.indexOf(key);
        if (i == -1) return null;
        T removed = vals.get(i);
        keys.remove(i);
        vals.remove(i);
        return removed;
    }
}
