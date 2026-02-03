import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtReader {
    private BufferedReader reader;

    public TxtReader(String filePath) throws IOException {
        reader = new BufferedReader(new FileReader(filePath));
    }

    public String nextLine() throws IOException {
        return reader.readLine();
    }

    public void close() throws IOException {
        reader.close();
    }
}
