package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Enter votre salaire horaire: ");
        int salaireHoraire = clavier.nextInt();

        // modif

        System.out.println("Enter vos heures travaillées: ");
        int nbHeuresTravaillees = clavier.nextInt();

        int res = salaireHoraire * nbHeuresTravaillees;

        System.out.println("Le salaire brut est :" + res);
    }
}



