/*
//pries nusprendziat masina stbdys ar gazuos, reikia ptikrinti ar tai sportine masina
    Jeigu Sportine masina: 50% kad pasikeis spoilerio pozicija

    30% stabdys 1-5
    50% gazuos 1-10
    20% nekeis greicio
    gazuok() jei spoileris nuleistas - gazuoja 2x greiciau
    stabdyk() jei spoileris pakeltas - stabdo 2x greiciau

    spoileris true - pakeltas, false - nuleistas
 */
package masinytes;

public class Masina {
    private String pavadinimas;
    public int maxGreitis;
    public int kelias; //pirma masina turi 0
    public int greitis;
    
    public Masina(String pavadinimas, int maxGreitis) {
        this.pavadinimas = pavadinimas;
        this.maxGreitis = maxGreitis;
        this.kelias = 0;
        this.greitis = 0;
    }
     public void gazuok() {
         // padidinti greiti
         //jei greitis > max greitis, greitis = max greitis.
         //nuvaziuoti atstuma./issaugoti duomenis
         this.greitis += Math.random() * 10 +1;
         if (this.greitis > this.maxGreitis){
             this.greitis = this.maxGreitis;
         }
         this.kelias += this.greitis;
     }
     
     public void stabdyk() {
         
         this.greitis -= Math.random() * 5 + 1;
         if(this.greitis < 0) {
             this.greitis = 0;
         }
         this.kelias += this.greitis;
     }
     
     public void vaziuok() { //kelias padideja ant tiek koks masinos gretiis x = greitis - kelias, kelias+= x
         this.kelias += this.greitis;
         if(this.greitis == 0) {
             this.gazuok();
         }
     }
     
     public void nuspreskKadaryt() {
         double mr = Math.random();
                if(mr <= 0.2) {
//                    System.out.println("20% tikimybes");
                    this.vaziuok();
                    //nekeis greicio
                }
                if(mr > 0.2 && mr <= 0.5) {
//                    System.out.println("30% tikimybes");
                    this.stabdyk();
                    //metodas stabdo
                }
                if(mr > 0.5) {
//                    System.out.println("50% tikimybes");
                    this.gazuok();
                    //metodas gazuoja
                }
     }

    public int getKelias() {
        return kelias;
    }

    public void setKelias(int kelias) {
        this.kelias = kelias;
    }
    
  
    
}
