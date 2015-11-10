/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRM668Div2;

import java.math.BigInteger;

/**
 *
 * @author mazenbadr
 */
public class AnArray {

    public int solveProblem(int[] A, int K) {
        int count = 0;
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    BigInteger num = BigInteger.valueOf(A[i] * A[j]).multiply(BigInteger.valueOf(A[k]));
                    if (num.mod(BigInteger.valueOf(K)) == BigInteger.valueOf(0)) {
                        count++;
                    }
                }
            }

        }

        return count;
    }
}
