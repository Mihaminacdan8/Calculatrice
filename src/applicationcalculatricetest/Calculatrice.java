/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcalculatricetest;

/**
 *
 * @author Inclusiv-PC07
 */
public class Calculatrice {

    /**
     * @param args the command line arguments
     */
    // Méthode pour l'addition
    public double addition(double a, double b) {
        return a + b;
    }

    // Méthode pour la soustraction
    public double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode pour la multiplication
    public double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode pour la division
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible !");
        }
        return a / b;
    }

}
