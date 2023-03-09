package org.lessons.java;

import java.util.Scanner;

//Snack 1
//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
public class Snack1 {
    public static void main(String[] args) {
        //inserisco il numero
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int number = Integer.parseInt(scan.nextLine());
        //controllo se il numero è divisibile per 2, quindi pari
        if (number % 2 == 0){
            //se è pari lo stampo
            System.out.println("Il tuo numero è pari " + "(" + number + ")");
            //altrimenti se non è pari, stampo il numero successivo
        }else {
            int newNumber = number + 1;
            System.out.println("Il tuo numero era dispari, ho stampato il numero successivo " + "(" + newNumber + ")");
        }
    }
}
