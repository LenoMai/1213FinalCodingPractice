package Prob1;

import java.io.*;

/**Write an Interface that specifies how a class will read in files and write out data (2
different methods). Write two different unrelated classes that both implement this
interface. */
public interface FileHandler {
    public void readFile(File filename) throws IOException;
    public void writeData(File filename, String data) throws IOException;
}
