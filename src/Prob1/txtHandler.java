package Prob1;

import java.io.*;

public class txtHandler implements FileHandler {

    public txtHandler() {
    }

    @Override
    public void readFile(File filename) throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    @Override
    public void writeData(File filename, String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(data);

        writer.close();
    }
}
