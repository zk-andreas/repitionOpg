package com.riddles.Fourth;

public class Firkant {
    public Firkant() {
        System.out.println("### Opgave 4 ###"); 
    }

    public void printFirkant(int str, String tegn) throws Exception {

        if (str < 0) {
            throw new Exception("Negative tal må ikke bruges!");
        } else if (str > 30) {
            throw new Exception("Tallet må maks være 30");
        } else {
            for (int i = 0; i < str; i++) {
                for (int j = 0; j < str; j++) {
                    System.out.print(tegn + " ");
                }
                System.out.println("");
            }
        }
    }
}
