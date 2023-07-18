/*
 * na classe Rettangolo con due attributi interi: base e altezza.
 * Aggiungere un opportuno costruttore con parametri.
 * Aggiungere due metodi: calcolaArea   e calcolaPerimetro che calcolano e restituiscono,
 *                        rispettivamente, l’area e il perimetro del rettangolo.
 *
 *
 * */

package org.lessons.java.geometria;

public class Rettangolo {
    // CLASSI
    int base;
    int altezza;
    // COSTRUTTORI
    Rettangolo(int base,int altezza){
        this.base=base;
        this.altezza=altezza;
    }
    //METODI
    // calcolo perimetro
    int calcolaPerimetro(){
        int perimetro;
        // calcolo perimetro
        perimetro=2*(base+altezza);
        return  perimetro;
    }
    // calcolo area

    int calcolaArea(){
        int area;

        area=base*altezza;
        return  area;
    }

    // disegna

    void disegna(){
        int base=this.base;
        int altezza=this.altezza;
        // prima riga
        for (int i = 0; i < base; i++) {
            System.out.print("o");
        }
        System.out.println();

        // righe interne
        for (int i = 0; i < altezza - 2; i++) {
            //primo o lo fa sempre
            System.out.print("o");
            //spazi vuoti
            for (int j = 0; j < base - 2; j++) {
                System.out.print(" ");
            }
            // ultimo o lo fa sempre
            System.out.println("o");
        }

        // ultima riga
        for (int i = 0; i < base; i++) {
            System.out.print("o");
        }
    }

}
