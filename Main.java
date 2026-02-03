import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //base para leer el ttxt
        try {
            TxtReader reader = new TxtReader("datos.txt");

            String line;
            while ((line = reader.nextLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /////////////
}


