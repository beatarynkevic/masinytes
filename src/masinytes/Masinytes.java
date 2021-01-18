/*
*0 0 0 0 0
*iteracijos metu random kiekviena pavaziuoja
*Pavaziuoja kiekviena nuo 1 iki 10km (Math.random)
*2 5 3 1 (nuvaziavo, tada patikrinam ar nenuvaziavo 1000km)
*5 6 8 7 (toliau pavaziuoja ir tikrinam)
*7 9 12 11
*tarpiniu rezultatus spausdinti kai pasiekia 100km (cia jeigu sudetingiau)
*bent viena turi 1000km nuvaziuoti
*atspausdina atstuma maziejimo tvarka
 */
package masinytes;

public class Masinytes {

    public static void main(String[] args) {
        Masina[] race = {           //kiekviena masina, tai objektas
            new Masina("Pirma", 140),
            new Masina("Antra", 160),
            new Masina("Trecia", 180),
            new Masina("Ketvirta", 220),
            //new SportineMasina("sp1", 300),
            //new SportineMasina("sp1", 300),
        };
        
        int[] cars = new int[8];
        int interm = 100;
        boolean doRace = true;
        while (doRace) {
//            for (int a = 0; a < 10; a++) { 
            for (int i = 0; i < race.length; i++) {     //visos masinos pavaziavo
                race[i].nuspreskKadaryt();
  
            }
            
            boolean printInterm = false;        //komentatorius
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for (int i = 0; i < race.length; i++) {
                if (race[i].getKelias() > intermWinnerKm) {
                    intermWinner = i + 1; //kuris automobilis
                    intermWinnerKm = race[i].getKelias();
                }
                if (race[i].getKelias() >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if (printInterm) {
                for (int i = 0; i < race.length; i++) {
                    System.out.print(race[i].getKelias() + "\t");
                }
                System.out.println();
                System.out.println(intermWinner + " automobilis nuvaziavo: " + intermWinnerKm);
                System.out.println();
            }
            for (int i = 0; i < race.length; i++) {     //tikrinimas
                if (race[i].getKelias() >= 1000) {
                    doRace = false;
                    break;
                }
            }
        }
        for (int i = 0; i < race.length - 1; i++) {     //rusiavimas
            for (int j = i + 1; j < race.length; j++) {
                if (race[i].getKelias() < race[j].getKelias()) {
                    Masina tmp = race[j];
                    race[j] = race[i];
                    race[i] = tmp;
                }
            }
        }
        for (int i = 0; i < race.length; i++) {
            System.out.println(race[i].getKelias());
        }
    }
    /*
        int mantoAmzius = 286154641;
        String mA = mantoAmzius+"";
        System.out.println(mA.charAt(mA.length()-3)); 
    */
}
