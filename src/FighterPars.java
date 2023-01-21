import java.util.Arrays;
import java.util.List;

public class FighterPars {

    public String parsObjectToString(Fighter fighterToString){
        String dataToString = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s;", fighterToString.getId(),fighterToString.getName(),fighterToString.getWeight() ,fighterToString.getAge(),
                fighterToString.getHeight(), fighterToString.getReach(), fighterToString.getStance(), fighterToString.getStyle(), fighterToString.isChampion());
        System.out.println(dataToString);
        return dataToString;

    }
    public Fighter parsStringToObject (String fighter){

        String [] arrayFighterData = fighter.split(",");


        Fighter fighter1 = new Fighter(Integer.valueOf(arrayFighterData[0]), arrayFighterData[1], Weight.valueOf(arrayFighterData[2]),Integer.valueOf(arrayFighterData[3]),
                Integer.valueOf(arrayFighterData[4]),Integer.valueOf(arrayFighterData[5]),Stance.valueOf(arrayFighterData[6]),
                Style.valueOf(arrayFighterData[7]) ,Boolean.valueOf(arrayFighterData[8]));

        return fighter1 ;
    }

}
