package exercise;

import java.util.ArrayList;
import java.util.List;


// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {
        List<String> apartments = new ArrayList<>();
        homes.sort((apart1, apart2) -> Double.compare(apart1.getArea(), apart2.getArea()));
        if(homes.isEmpty()) {
            return apartments;
        }
        for (int i = 0; i < count; i++) {
            apartments.add(homes.get(i).toString());
        }
        return apartments;
    }
}
// END
