import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FighterPars {





    public String ParsObjectToString (Fighter fighterToString){
        String dataToString = String.format("%s,%s,%s,%s,%s,%s,%s,%s;", fighterToString.getName(),fighterToString.getWeight() ,fighterToString.getAge(),
                fighterToString.getHeight(), fighterToString.getReach(), fighterToString.getStance(), fighterToString.getStyle(), fighterToString.isChampion());
        System.out.println(dataToString);
        return dataToString;

    }

}
