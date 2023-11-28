import java.util.HashMap;
import java.util.Map;

public class maps {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Add elements to the map
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);

        // Display elements in the map
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key is present and get its value
        String studentName = "Bob";
        if (studentScores.containsKey(studentName)) {
            System.out.println("\n" + studentName + "'s score: " + studentScores.get(studentName));
        } else {
            System.out.println("\n" + studentName + " not found in the map.");
        }

        // Remove an element from the map
        String studentToRemove = "Charlie";
        studentScores.remove(studentToRemove);
        System.out.println("\nAfter removing " + studentToRemove + ":");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
