import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReedFile {



    public String readLineFromFile(Scanner scanner1){
        String s = "";
        if (scanner1.hasNext()) {
            s = scanner1.nextLine();
        }
        return s;
    }
}
