import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose function");
        String function = scanner.nextLine();

        switch (function.toLowerCase()){
            case "create" :
                System.out.println("Create");
                CreateFighter.createFighter();
                break;

            case "read" :
                System.out.println("Read");
                ReadFigther.readFigther();
                break;

            case "delete" :
                System.out.println("Delete");
                DeleteFighters.deleteFighters();
                break;

            case "update" :
                UpdateFighters.updateFighters();
                        break;

            case "backupTo" :
                BackupTo.backupTo();

            case "backup":
                Backup.backup();
        }






    }
}