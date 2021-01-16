package masinytes;
                                    //JUODRASTIS!!!
public class NewClass {
    
    public static void main(String[] args) {
        int[] cars = new int[8];
        int interm = 100;
        boolean doRace = true;
        
        while (doRace) {
            for (int i = 0; i < cars.length; i++) {     //visos masinos pavaziavo
                cars[i] += Math.random();
            } //0-0.9 * 10 + 1 = max yra 10 
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
        
        for (int i = 0; i < cars.length; i++) { //isspausdina
            System.out.println(cars[i]);
        }
    }
}
