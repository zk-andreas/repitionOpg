package com.riddles.Fifth;

import java.util.Scanner;

public class Menu {

    private final Scanner sc = new Scanner(System.in);

    public Menu() {
        System.out.println("### Menu ###");
    }

    public void runMenu(){
        printMenu();
        int menuVal = brugerInput();
        switch (menuVal){
            case 1:
                System.out.println("Beregn valgt");
                break;
            case 2:
                System.out.println("Udskriv valgt");
                break;
            case 3:
                System.out.println("Hjælp valgt");
                break;

            default:
                System.out.println("Forkert menupunkt valgt");
                runMenu();

        }

    }

    private int brugerInput() {
        System.out.println("Indtast dit valg");
        return Integer.parseInt(sc.nextLine());
    }

    private void printMenu() {
        System.out.println("1.\tBeregn");
        System.out.println("2.\tUdskriv");
        System.out.println("3.\tHjælp");
    }
}
