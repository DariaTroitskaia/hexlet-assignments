package exercise;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Set;

// BEGIN
class App {
    public static final void swapKeyValue(KeyValueStorage kv) {
        Map<String, String> map = kv.toMap();
        for (var entry: map.entrySet()) {
            kv.unset(entry.getKey());
            kv.set(entry.getValue(), entry.getKey());
        }
    }
}
// END
