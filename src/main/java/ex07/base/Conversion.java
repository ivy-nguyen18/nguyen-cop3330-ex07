 /*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package ex07.base;

public class Conversion {
    static final double C_FACTOR = 0.09290304;
    private float length;
    private float width;

    public void feet(float length, float width){
        double area = length * width;
        System.out.printf("%d square feet%n", (int)area);
    }

    public void squareMeters(float length, float width){
        double area = (length * width) * C_FACTOR;
        System.out.printf("%.3f square meters", area);
    }
}
