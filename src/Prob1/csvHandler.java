package Prob1;

import java.io.*;

public class csvHandler implements FileHandler {

    public csvHandler() {
    }

    @Override
    public void readFile(File filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        reader.close();
    }

    public void writeData(File filename, String data) throws IOException {
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(filename));
        writer.write(data);
        throw new IOException("Error writing to CSV file: " + e.getMessage());

        writer.close();
    }
}