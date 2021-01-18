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
     public void gazuok(int kiek) {
         this.greitis += kiek;
         if (this.greitis > this.maxGreitis){
             this.greitis = this.maxGreitis;
         }
     }
     public void stabdyk(int kiek) {
         this.greitis -= kiek;
         if(this.greitis < 0) {
             this.greitis = 0;
         }
     }
     public void vaziuok() { //kelias padideja ant tiek koks masinos gretiis x = greitis - kelias, kelias+= x
         this.kelias += this.greitis;
     }
     
    public int getKelias() {
        return kelias;
    }

    public void setKelias(int kelias) {
        this.kelias = kelias;
    }

    @Override
    public String toString() {
        return "Masina{" + "pavadinimas=" + pavadinimas + ", maxGreitis=" + maxGreitis + ", kelias=" + kelias + ", greitis=" + greitis + '}';
    }
}
