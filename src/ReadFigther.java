import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFigther {



    public static void readFigther ()
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter fighter id");
            String idFighter = scanner.nextLine().toLowerCase();
            ReedFile reedFile = new ReedFile();
            Scanner scanner1 = new Scanner(WritertoFile.file);
            String data = reedFile.readLineFromFile(scanner1);
            if (idFighter.equals("all")){
                while (!data.isEmpty() && data != null){
                    System.out.println(data);
                    data = reedFile.readLineFromFile(scanner1);
                }

            }
            else {
                while (!data.isEmpty()) {
                    if (data.startsWith(idFighter)) {
                        System.out.println(data);
                        break;
                    } else {
                        System.out.println("dsada");
                        data = reedFile.readLineFromFile(scanner1);

                    }

                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }


}
