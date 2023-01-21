import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;



import java.util.Scanner;

public class UpdateFighters {
    static File file = new File("Fighters.txt");
    static Scanner scanner = new Scanner(System.in);

    public static void updateFighters (){
        Fighter fighterUpdate = null;
        LinkedList<String> fightersArray = new LinkedList<>();
        FighterPars fighterPars = new FighterPars();


        System.out.println("Enter id for update");
        String idFighter = scanner.nextLine().toLowerCase();

        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(WritertoFile.file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner1.hasNextLine()){
            String fighterLine = scanner1.nextLine();

            if (fighterLine.startsWith(idFighter)){
                fighterUpdate = fighterPars.parsStringToObject(fighterLine);
                String objectToString = fighterPars.parsObjectToString(chooseCharacteristic(fighterUpdate));
                fightersArray.add(objectToString);
            }
            else {
                fightersArray.add(fighterLine);
            }
        }

        PrintWriter pw = null;
        try {
             pw = new PrintWriter(file);
            for (String fighters : fightersArray ) {
                pw.println(fighters);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }

    }




   public static Fighter chooseCharacteristic(Fighter fighter){
        System.out.println("Choose  characteristic for update");
        System.out.println("3 - weight");
        System.out.println("2 - age");
        System.out.println("4 - height");
        System.out.println("5 - reach");
        System.out.println("6 - stance");
        System.out.println("7 - style");
        int chooseFunction = scanner.nextInt();
        switch (chooseFunction) {
            case 2:
                System.out.println("Enter new age");
                fighter.setAge(scanner.nextInt());
                break;
            case 3:
                System.out.println("Enter new weight");
                System.out.println("1- LIGHTWEIGHT, 2-WELTERWEIGHT, 3-MIDDLEWEIGHT, 4-LIGHT_HEAVYWEIGHT, 5-HEAVYWEIGHT");
                switch (scanner.nextInt()) {
                    case 1:
                        fighter.setWeight(Weight.LIGHTWEIGHT);
                        break;
                    case 2:
                        fighter.setWeight(Weight.WELTERWEIGHT);
                        break;
                    case 3:
                        fighter.setWeight(Weight.MIDDLEWEIGHT);
                        break;
                    case 4:
                        fighter.setWeight(Weight.LIGHT_HEAVYWEIGHT);
                        break;
                    case 5:
                        fighter.setWeight(Weight.HEAVYWEIGHT);
                        break;

                }
                break;
            case 4:
                System.out.println("Enter new height");
                fighter.setHeight(scanner.nextInt());
                break;

            case 5:
                System.out.println("Enter new reach");
                fighter.setReach(scanner.nextInt());
                break;

            case 6:
                System.out.println("Enter new stance");
                System.out.println("1-AMBIDEXTROUS, 2-LEFT_HANDED, 3-RIGHT_HANDED");
                switch (scanner.nextInt()) {
                    case 1:
                        fighter.setStance(Stance.AMBIDEXTROUS);
                        break;
                    case 2:
                        fighter.setStance(Stance.LEFT_HANDED);
                        break;
                    case 3:
                        fighter.setStance(Stance.RIGHT_HANDED);
                        break;
                }

                 case 7 :
                System.out.println("Enter new Style");
                System.out.println("1-BOXING, 2-WRESTLING, 3-JUDO, 4-MUAY_THAI, 5-COMBAT_SAMBO, 6-JIU_JITSU");

                switch (scanner.nextInt()){
                    case 1:
                        fighter.setStyle(Style.BOXING);
                        break;
                    case 2:
                        fighter.setStyle(Style.WRESTLING);
                        break;
                    case 3:
                        fighter.setStyle(Style.JUDO);
                        break;
                    case 4:
                        fighter.setStyle(Style.MUAY_THAI);
                        break;
                    case 5:
                        fighter.setStyle(Style.COMBAT_SAMBO);
                        break;
                    case 6:
                        fighter.setStyle(Style.JIU_JITSU);
                        break;

                }
                break;




        }
       return fighter;
    }
}