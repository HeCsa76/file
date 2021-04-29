package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook (Map<String, String> contacts, String output) throws IOException {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        FileWriter fileWriter = new FileWriter(output);

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            fileWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        fileWriter.close();
    }
}