import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WritertoFile {
    public static File file = new File("Fighters.txt");



/*    public void writerToFile (String dataToString) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
            pw.println(dataToString);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }
    }*/
     public void writeToFileUpgrade (String dataTostring){
         Scanner scanner = null;
         LinkedList <String> figtersArray = new LinkedList<>();
         
         try {
             scanner = new Scanner(WritertoFile.file);
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         }
         while (scanner.hasNextLine()){
             figtersArray.add(scanner.nextLine());
         }

         int id = figtersArray.size() > 0 ? Integer.valueOf(figtersArray.getLast().split(",")[0]) + 1 : 1;
         figtersArray.add(id + "," + dataTostring);
         PrintWriter pw = null;
         
         try {
             pw = new PrintWriter(file);
             for (String fighters : figtersArray ) {

                 pw.println(fighters);
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } finally {
             pw.close();
         }
         
     }
}
