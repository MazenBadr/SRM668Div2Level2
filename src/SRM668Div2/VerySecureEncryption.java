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
public class VerySecureEncryption {

    public String encrypt(String message, int[] key, int K) {
//        char[] encrypted = message.toCharArray();
        for (int k = 0; k < K; k++) {

            char[] encrypted = message.toCharArray();
            char[] temp = message.toCharArray();
            for (int i = 0; i < message.length(); i++) {
                encrypted[key[i]] = message.charAt(i);
            }
            int i = 0;

            message = encrypted.toString();
        }
        return message;
    }
}
