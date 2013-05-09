/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parrot;

import java.util.Scanner;
/**
 *
 * @author martin
 */
public class Parrot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jsem virtuální papoušek Lóra, rád opakuji!");
        System.out.println("Napiš něco: ");
        String vstup = sc.nextLine();
        String vystup;
        vystup = vstup + ", " + vstup + "!";
        System.out.println(vystup);
    }
}
