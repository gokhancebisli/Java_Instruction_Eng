package day2_typecasting_wrapperclasses;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
/* Type a program which calculates the area and the perimeter of a square whose side length is entered by user
(Geben Sie ein Programm ein, das die Fläche und den Umfang eines Quadrats berechnet, dessen Seitenlänge vom Benutzer eingegeben wird.)
         a==> Area: a*a
         a==> Perimeter : 4*a
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side length of the square...");
        double side=scanner.nextDouble();

        System.out.println("Area: "+side*side);
        System.out.println("Perimeter: "+4*side);



    }
}
