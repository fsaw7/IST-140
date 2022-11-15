/*
 * Fatou Sawaneh
 * Average Calculator Lab
 * 9/23/21
 * fjs5286@psu.edu
 */
package stringlength;

import java.util.Scanner;

/**
 * StringLenth.java
 * @author fatousawaneh The purpose of this class is to determine the length of a string
 */
public class StringLength {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = " ";
        int Stringword = word.length();

        System.out.println("Please enter a string: ");
        word = in.nextLine();

        System.out.println("Your string has a length of " + word.length() + " characters.");

    }

}
