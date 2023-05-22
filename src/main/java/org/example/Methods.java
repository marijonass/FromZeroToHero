package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
    private static int irasoIdSkaitiklis;
    static Scanner sc = new Scanner(System.in);
    List<Irasas> irasai = new ArrayList<>();
    static Boolean runProgram = true;


    public  void pridetiIrasa() {
        Irasas irasas = new Irasas(++irasoIdSkaitiklis);
        Category category = getCategory();
        LocalDateTime data = LocalDateTime.now();
        Double suma = gautiPajamuSuma();
        String komentaras = getKomentaras();
        irasai.add(irasas);
        irasas.print();

    }


    // gauti kategorija
    public Category getCategory() {
        while (true) {
            for (int i = 0; i < Category.values().length; i++) {
                System.out.print((i+1) + " - " + Category.values()[i] + "; ");
            }
            System.out.println();

            String kategorijaStr = getUserInput("Iveskite pajamu kategorija");
            try {
                return Category.getByName(kategorijaStr);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double gautiPajamuSuma() {
        while (true) {
            String pajamuSumaStr = getUserInput("Iveskite pajamu suma");
            try {
                return Double.parseDouble(pajamuSumaStr);
            } catch (NumberFormatException e) {
                System.out.println("Bloga suma - iveskite skaiciu");
            }
        }
    }

    public String getUserInput(String message) {
        System.out.println(message);
        String pajamuSumaStr = sc.nextLine();
        if (pajamuSumaStr.toUpperCase().equals("X")) {
            try {
                throw new BackToMainMenuException();
            } catch (BackToMainMenuException e) {
                throw new RuntimeException(e);
            }
        }
        return pajamuSumaStr;
    }

    public String getKomentaras() {
        System.out.println("Iveskite papildoma info");
        return sc.nextLine();
    }

}
