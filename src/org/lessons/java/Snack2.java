package org.lessons.java;


import java.util.Random;

//Snack2
//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a
// video una falsa lista di invitati con nome e cognome.
public class Snack2 {
    public static void main(String[] args) {
        //creo due array
        String[] names = {"andrea", "giovanni", "matteo"};
        String[] surnames = {"pricoco", "bassani", "giovagnotti"};

        //uso il metodo random per prendere casualmente un dato dall'array
        Random random = new Random();

        for (int i = 0; i < names.length; i++) {
            int randomName = random.nextInt(names.length);
            int randomSurname = random.nextInt(surnames.length);
            System.out.println(names[randomName] + " " + surnames[randomSurname]);
        }
    }
}
