package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Je pense à un nombre entre 1 et 100. Devinez lequel !");
        Random r = new Random();
        int nbAleatoire = r.nextInt(100);
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombreJoueur = clavier.nextInt();
        clavier.close();
        if (nombreJoueur == nbAleatoire) {
            System.out.println("Bravo tu as lu dans mes pensées !");
        } else if (nombreJoueur > nbAleatoire) {
            int surplus = nombreJoueur - nbAleatoire;
            System.out.println("Le nombre auquel je pensais était : " + nbAleatoire);
            System.out.println("Tu as " + surplus + " en trop !");
        } else {
            int manque = nbAleatoire - nombreJoueur;
            System.out.println("Le nombre auquel je pensais est : " + nbAleatoire);
            System.out.println("Il te manque " + manque + " pour avoir mon nombre !");
        }

    }

}
