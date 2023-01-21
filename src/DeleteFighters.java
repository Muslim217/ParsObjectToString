import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteFighters {
    public static File file = new File("Fighters.txt");

    public static void deleteFighters () {
        Scanner scannerId = new Scanner(System.in);
        Scanner scanner = null;
        LinkedList <String> fighterArray = new LinkedList<>();
        System.out.println("Enter id for delete");
        String id = scannerId.nextLine();
        System.out.println(id);

        try {
            scanner = new Scanner(DeleteFighters.file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNext()) {
            fighterArray.add(scanner.nextLine());
        }
        System.out.println(fighterArray);
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(file);
            for (String fighters : fighterArray) {
                if (!fighters.startsWith(id))
                    pw.println(fighters);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }

    }
}