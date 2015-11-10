/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRM668Div2;

/**
 *
 * @author mazenbadr
 */
public class SRM668Div2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IsItASquare isSqr = new IsItASquare();
        int[] x = {0, 5, 3, 8};
        int[] y = {0, 0, 4, 4};
//        System.out.println(isSqr.isSquare(x, y));
        AnArray anArray = new AnArray();
        int[] A = {100000000, 100000000, 100000000};
        int K = 1000000;
//        System.out.println(anArray.solveProblem(A, K));
        VerySecureEncryption enc = new VerySecureEncryption();
        String message = "abcde";
        int[] key = {4, 3, 2, 1, 0};
        int k = 1;
        System.out.println(enc.encrypt(message, key, K));
    }

}
