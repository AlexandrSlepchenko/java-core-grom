package lesson34.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class Solution {

    public void copyFileContent(String fileFromPath, String fileToPath) throws Exception {

        validateFile(fileFromPath, fileToPath);

        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        try {
            Files.copy(fileFrom.toPath(), fileTo.toPath());
        } catch (IOException e) {
            System.err.println("Cant copy content from file " + fileFromPath + " to " + fileToPath);
        }
    }

    private void validateFile(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File " + fileFrom + " does not exist");
        }

        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileTo + " does not exist");
        }

        if (!fileFrom.canRead()) {
            throw new Exception("File " + fileFrom + " does not have permissions to read");
        }

        if (!fileTo.canWrite()) {
            throw new Exception("File " + fileFrom + " does not have permissions to be written");
        }
    }
}
