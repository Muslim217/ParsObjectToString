import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BackupTo {

    public static void backupTo(){
        PrintWriter pw = null;
        File writeTo = new File("Fighters");
        Scanner scan = new Scanner(System.in);
        File file = new File("BackupDirectory");
        String[] fileInArray = file.list();
        for(int i = 0; i < fileInArray.length; i++){
            System.out.println("id " + i + " " + fileInArray[i]);
        }
        System.out.println("Enter number file for backup ");
        int idFile = scan.nextInt();
        File file1 = new File(fileInArray[idFile]);
        try {
            pw = new PrintWriter(writeTo);
            Scanner readFrom = new Scanner(file1);
            while (readFrom.hasNextLine()){
                pw.println(writeTo);
            }

        }catch (Exception e ){
            System.out.println("error");

        }finally {
            pw.close();
        }



}

}
