package day2_typecasting_wrapperclasses;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
/* Type a program which calculates the volumeof a rectangular prism whose length,width, and height are entered by user.
Geben Sie ein Programm ein, das das Volumen eines rechteckigen Prismas berechnet, dessen Länge, Breite und Höhe vom Benutzer eingegeben werden.*/

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the length of the rectangle...");
        double length= scanner.nextDouble();

        System.out.println("Enter the width of the rectangle");
        double width= scanner.nextDouble();

        System.out.println("Enter the height of the rectangle");
        double height= scanner.nextDouble();

        System.out.println("Volume: "+width*length*height);



    }
}
