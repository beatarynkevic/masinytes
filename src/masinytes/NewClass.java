package masinytes;
                                    //JUODRASTIS!!!
public class NewClass {
    
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
