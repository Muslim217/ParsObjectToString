import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReedFile {


    public List<Fighter> readObjectFromFile (){
        Scanner scanner = null;
        List<Fighter> fighters = new ArrayList<>();
        try {
            scanner = new Scanner(WritertoFile.file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
    }
        String dataInLine = scanner.nextLine();
        List <String> data = Arrays.asList(dataInLine.split(";"));
        for (String fighter: data) {
            String [] arrayFighterData = fighter.split(",");
            fighters.add(new Fighter(arrayFighterData[0], Weight.valueOf(arrayFighterData[1]),Integer.valueOf(arrayFighterData[2]),
                    Integer.valueOf(arrayFighterData[3]),Integer.valueOf(arrayFighterData[4]),Stance.valueOf(arrayFighterData[5]),
                            Style.valueOf(arrayFighterData[6]) ,Boolean.valueOf(arrayFighterData[7])));
        }
        return fighters;


    }
}
