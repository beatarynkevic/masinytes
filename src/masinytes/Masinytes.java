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
        int[] cars = new int[8];
        int interm = 100;
        boolean doRace = true;
        
        while (doRace) {
            for (int i = 0; i < cars.length; i++) {     //visos masinos pavaziavo
                cars[i] += Math.random() * 10 + 1;
            }
            
            boolean printInterm = false;        //komentatorius
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for (int i = 0; i < cars.length; i++) {
                if (cars[i] > intermWinnerKm) {
                    intermWinner = i + 1;
                    intermWinnerKm = cars[i];
                }
                if (cars[i] >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if (printInterm) {
                for (int i = 0; i < cars.length; i++) {
                    System.out.print(cars[i] + "\t");
                }
                System.out.println();
                System.out.println(intermWinner + " automobilis nuvaziavo: " + intermWinnerKm);
                System.out.println();
            }
            for (int i = 0; i < cars.length; i++) {     //tikrinimas
                if (cars[i] >= 1000) {
                    doRace = false;
                    break;
                }
            }
        }
        
        for (int i = 0; i < cars.length - 1; i++) {     //rusiavimas
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i] < cars[j]) {
                    int tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
