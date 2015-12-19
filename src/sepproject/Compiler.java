/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepproject;

/**
 *
 * @author Jan
 */
public class Compiler {

    // metoda, která po zadani N vrati suma fibonaciho posloupnosti

    long fibSum(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (fibSum(n - 1) + fibSum(n - 2));
        }
    }
}
