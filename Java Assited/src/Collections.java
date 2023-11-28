import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList Elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        System.out.println("\nHashSet Elements:");
        Iterator<Integer> iteratorHashSet = hashSet.iterator();
        while (iteratorHashSet.hasNext()) {
            System.out.println(iteratorHashSet.next());
        }

     
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("\nHashMap Elements:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
