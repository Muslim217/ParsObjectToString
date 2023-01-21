import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Backup {

    public static void  backup () {
        Date date = new Date();
        String id = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        File writeTo = new File("BackupDirectory/Backup.txt" + formatter.format(date) + " id " + id);
        File readFrom = new File("Fighters.txt");
        File directory = new File("BackupDirectory");

        PrintWriter pw = null;
        Scanner scanner = null;

        try {
            directory.mkdir();
            scanner = new Scanner(readFrom);
            pw = new PrintWriter(writeTo);
            if (directory.list().length < 1) {
                id = "(0)";
            }
            writeTo.createNewFile();
            while (scanner.hasNextLine()) {
                pw.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
        String[] list = directory.list();


    }
}
