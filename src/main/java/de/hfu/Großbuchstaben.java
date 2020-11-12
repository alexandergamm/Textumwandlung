package de.hfu;

import java.util.Scanner;

/**
 * Text in Großbuchstaben umwandeln
 * 
 * @author Alexander Gamm
 * @version 1.0.0
 */
public class Großbuchstaben {
    public static void main( String[] args ) {
        System.out.print("Geben Sie bitte den in Großbuchstaben umzuwandelnden Text ein: ");
    	Scanner eingabe = new Scanner(System.in);
        System.out.println("Eingegebener Text in Großbuchstaben: " + eingabe.nextLine().toUpperCase());
    }
}