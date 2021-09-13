package day2_typecasting_wrapperclasses;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
/*Type a program which calculates the area and the perimeter of a rectangle whose length and width are entered by user
Geben Sie ein Programm ein, das die Fläche und den Umfang eines Rechtecks berechnet, dessen Länge und Breite vom Benutzer eingegeben werden*/

       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle...");
        double length= scanner.nextDouble();

        System.out.println("Enter the width of the rectangle");
        double width= scanner.nextDouble();

        System.out.println("Area: "+width*length );
        System.out.println("Perimeter : "+2*(width+length));






    }


}

