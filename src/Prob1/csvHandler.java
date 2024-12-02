package Prob1;

import java.io.*;

public class csvHandler implements FileHandler{

    public csvHandler(){}
    
    @Override
    public void readFile(File filename) throws IOException{
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new IOException("Error reading CSV file: " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        
    }

    public void writeData(File filename, String data) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            writer.write(data);
        } catch (IOException e) {
            throw new IOException("Error writing to CSV file: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    
}
