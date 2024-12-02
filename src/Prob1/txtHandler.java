package Prob1;

import java.io.*;

public class txtHandler implements FileHandler{

    public txtHandler(){}
    
    @Override
    public void readFile(File filename) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException("Error reading TXT file: " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    @Override
    public void writeData(File filename, String data) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            writer.write(data);
        } catch (IOException e) {
            throw new IOException("Error writing to TXT file: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
