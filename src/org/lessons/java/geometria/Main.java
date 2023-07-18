/*ale chiedete all’utente di inserire, da console,
i valori di base e di altezza con cui istanziare un nuovo Rettangolo.
Dopo averlo istanziato, stampate a video il perimetro e l’area.*/

package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // chiediamo all utente i valori di input
        System.out.print("Inserisci la base : ");
        int baseInput=Integer.parseInt(scan.nextLine());
        System.out.print("Inserisci l'altezza : ");
        int heightInput=Integer.parseInt(scan.nextLine());

        // creiamo il rettangolo
        Rettangolo rettangolo= new Rettangolo(baseInput,heightInput);
        // stampa dei dati
        System.out.println( "Base : "+rettangolo.base);
        System.out.println("Altezza : "+rettangolo.altezza);



        // chiamata dei metodi
        int perimetro= rettangolo.calcolaPerimetro();
        System.out.println("Perimetro : "+ perimetro);

        int area= rettangolo.calcolaArea();
        System.out.println("Area : "+ area);

        rettangolo.disegna();
        scan.close();
    }
}
