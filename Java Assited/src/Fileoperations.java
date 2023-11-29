import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Fileoperations {

    public static void main(String[] args) {
        String fileName = "Java.txt";

        // Create a file
        createFile(fileName);

        // Read from the file
        readFile(fileName);

        // Update the file
        updateFile(fileName, "This is an updated content.");

        // Read the updated file
        readFile(fileName);

        // Delete the file
        deleteFile(fileName);
    }

    // Create a new file
    private static void createFile(String fileName) {
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Read content from the file
    private static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nReading from the file:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    // Update the content of the file
    private static void updateFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\n" + content);
            System.out.println("\nFile updated.");

        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }

    // Delete the file
    private static void deleteFile(String fileName) {
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("\nFile deleted: " + file.getName());
        } else {
            System.out.println("\nFailed to delete the file.");
        }
    }
}
