package E_AssociativeArrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) {

        //no order at all. Items are saved randomly.
        HashMap<String, Integer> planesMap = new HashMap<>();
        planesMap.put("Boeing", 120);
        planesMap.put("Vivo", 130);
        planesMap.put("Zero", 160);
        planesMap.put("Aero", 190);

        //items are saved by the order they were added to the map
        LinkedHashMap<String, Integer> planesLinkedMap = new LinkedHashMap<>();
        planesLinkedMap.put("Boeing", 120);
        planesLinkedMap.put("Vivo", 130);
        planesLinkedMap.put("Zero", 160);
        planesLinkedMap.put("Aero", 190);

        //we do not need to check whether an object exists. if it does not, just nothing is removed.
        planesLinkedMap.remove("noSuchPLane");

        //if the same key is added twice, there is no error, but the new value is linked  to the key.
        planesLinkedMap.put("Aero1", 190);
        planesLinkedMap.put("Aero1", 210);

        //items are saved in ascending order defined by the key
        TreeMap<String, Integer> planesTreeMap = new TreeMap<>();
        planesTreeMap.put("Boeing", 120);
        planesTreeMap.put("Vivo", 130);
        planesTreeMap.put("Zero", 160);
        planesTreeMap.put("Aero", 190);

        //how to iterate a map:
        //mapName.entrySet() + alt + enter -> the code below is generated
        for (Map.Entry<String, Integer> planeEntry : planesLinkedMap.entrySet()) {
            System.out.printf("%s - %d\n", planeEntry.getKey(), planeEntry.getValue());
        }

    }
}
