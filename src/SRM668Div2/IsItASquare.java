/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRM668Div2;

import java.lang.Math.*;
import java.util.Arrays;

/**
 *
 * @author mazenbadr
 */
public class IsItASquare {

    public String isSquare(int[] x, int[] y) {
        double[] lines = new double[6];
        for (int i = 0; i < lines.length; i++) {
            int[] point1 = new int[2];
            int[] point2 = new int[2];
            if (i < 3) {
                point1[0] = x[0];
                point1[1] = y[0];
                point2[0] = x[i + 1];
                point2[1] = y[i + 1];
                lines[i] = getLine(point1, point2);
            } else if (i < 5) {
                point1[0] = x[1];
                point1[1] = y[1];
                point2[0] = x[i - 1];
                point2[1] = y[i - 1];
                lines[i] = getLine(point1, point2);
            } else {
                point1[0] = x[2];
                point1[1] = y[2];
                point2[0] = x[i - 2];
                point2[1] = y[i - 2];
                lines[i] = getLine(point1, point2);
            }
        }
        Arrays.sort(lines);
        if (lines[0] == lines[1] && lines[1] == lines[2] && lines[2] == lines[3]) {
            double diagonal = Math.sqrt((lines[1] * lines[1]) + (lines[2] * lines[2]));
            if (diagonal == lines[4] && diagonal == lines[5]) {
                return "It's a square";
            } else {
                return "Not a square";
            }

        } else {
            return "Not a square";
        }
    }

    private double getLine(int[] point1, int[] point2) {
        return Math.sqrt(((point1[0] - point2[0]) * (point1[0] - point2[0]))
                + ((point1[1] - point2[1]) * (point1[1] - point2[1])));
    }
}
