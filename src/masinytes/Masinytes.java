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
        
        int[][] rez = new int[cars.length][cars.length];
        
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                int randomDistance = (int) (Math.random() * 10) + 1;
                cars[j] += randomDistance;
                rez[i][j] = cars[j];
            }
        }
        for (int i = 0; i < rez.length; i++) {
            int[] eilute = rez[i];
            for (int j = 0; j < eilute.length; j++) {
                int elementas = eilute[j];
                System.out.print(elementas + " ");
            }
            System.out.println();
        }
    }
}
