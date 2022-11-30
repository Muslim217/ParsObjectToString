public class Main {
    public static void main(String[] args) {
/*        WritertoFile writertoFile = new WritertoFile();
      Fighter fighter1 =
              new Fighter("Jon Jones",Weight.LIGHTWEIGHT,
                      35,193,215,Stance.AMBIDEXTROUS,Style.WRESTLING,true);

      Fighter fighter2 = new Fighter("Anderson Silva", Weight.MIDDLEWEIGHT,
              47,188,197,Stance.LEFT_HANDED,Style.MUAY_THAI,true);

      FighterPars fighterPars = new FighterPars();
      writertoFile.writerToFile(fighterPars.ParsObjectToString(fighter1));*/
        ReedFile reedFile = new ReedFile();
        for (Fighter fighter : reedFile.readObjectFromFile()) {
            System.out.println(fighter);
        }


    }
}