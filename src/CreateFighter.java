import java.util.Scanner;

public class CreateFighter {

    public static void createFighter (){
        WritertoFile writertoFile = new WritertoFile();
        FighterPars fighterPars = new FighterPars();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of Fighter");
        String name = scanner.next();
        System.out.println("Enter weight ");
        String weight = scanner.next().toUpperCase();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter height");
        int height = scanner.nextInt();
        System.out.println("Enter reach");
        int reach = scanner.nextInt();
        System.out.println("Enter stance");
        String stance = scanner.next().toUpperCase();
        System.out.println("Enter style");
        String style = scanner.next().toUpperCase();
        System.out.println("Enter status. Champ or No champ");
        String isChamp = scanner.next();
        boolean isChampion = false;
        switch (isChamp.toLowerCase()){
            case "champ":
                isChampion = true;

            case "No champ":
                isChampion = false;
        }
        scanner.close();



        Fighter fighter = new Fighter(name,Weight.valueOf(weight),age,height,reach,Stance.valueOf(stance),Style.valueOf(style),isChampion);
        System.out.println(fighter);
        writertoFile.writeToFileUpgrade(fighterPars.parsObjectToString(fighter));

    }
}
