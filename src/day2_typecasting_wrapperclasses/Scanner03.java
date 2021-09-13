package day2_typecasting_wrapperclasses;

import java.util.Scanner;

class Scanner03 {
    public static void main(String[] args) {
        //Type a program which calculates the cube of a number which is entered by user
//(Geben Sie ein Programm ein, das den Würfel einer vom Benutzer eingegebenen Zahl berechnet)


        Scanner scanner=new Scanner(System.in);
        System.out.println("Hey user, enter a number to calculate its cube..");
        double number= scanner.nextDouble();
        System.out.println(number*number*number);

    }
}
