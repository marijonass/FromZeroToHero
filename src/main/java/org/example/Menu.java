package org.example;

import java.util.Scanner;

public class Menu {
    static Methods methods=new Methods();
    public static void setMenu(){

        Scanner scanner=new Scanner(System.in);
        String menu = ("[1]pasirinkite islaidu kategorija+\n" +
                       "[2]pasirinkite  xxxxxx+\n" +
                       "[x]out\n");

        Boolean runProgram = true;

        while (runProgram){
            System.out.println("iveskite ka norite daryti ");
            System.out.println(menu);
            String str= scanner.nextLine();

            switch (str){
                case "1":
                  methods.pridetiIrasa();

                    break;
                case "2":
                    System.out.println(" antras 2");
                    break;
                case "x":
                    runProgram=false;
                    System.out.println("isejimas is programos");
                default:
                    System.out.println(" viso gero");
            }







        }



    }




}
