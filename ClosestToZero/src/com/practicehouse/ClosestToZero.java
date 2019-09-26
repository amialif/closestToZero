/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicehouse;

import java.util.Arrays;

/**
 *
 * @author marifurr
 */
public class ClosestToZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] testingArray = {4,7,9,2};
        
        int result = getClosestToZero(testingArray);
        
        System.err.println("The Closest Number To Zero is : " + result);

    }

    public static int getClosestToZero(int[] a) {
        int currentValue = 0;
        int closestVal = a[0];
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            currentValue = a[i] * a[i];
            if (currentValue <= (closestVal * closestVal)) {
                closestVal = a[i];
            }
        }
        return closestVal;
    }

}
