import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritertoFile {
    public static File file = new File("Fighters.txt");



    public void writerToFile (String dataToString) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
            pw.println(dataToString);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }
    }
}
